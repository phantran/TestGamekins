jQuery3("#rejectModal").on('show.bs.modal', function (event) {
    var modal = jQuery3(this)
    var button = jQuery3(event.relatedTarget)
    var descriptorFullUrl = button.data('descriptor-url')
    var challengeID = button.data('challenge-id')

    modal.find('.modal-title').text('Reject Current Challenge ' + challengeID)
    var rejectBtnConfirm = modal.find('#rejectButtonConfirm')
    rejectBtnConfirm.data("cid", challengeID)
    rejectBtnConfirm.data("url", descriptorFullUrl)
})

jQuery3('#rejectButtonConfirm').on('click', function () {
    var btn = jQuery3(this)
    var challengeID = btn.data('cid')
    var descriptorFullUrl = btn.data('url')
    var modal = jQuery3("#rejectModal")
    let challenge = jQuery3("#currentChallengeText" + challengeID)[0].innerText
    let reason = modal.find('#reason-text').val()
    let url = descriptorFullUrl + "/rejectChallenge"
    let parameters = {}
    parameters["reject"] = challenge
    parameters["reason"] = reason

    new Ajax.Request(url, {
        parameters: parameters,
        onComplete: function (rsp) {
            if (rsp.responseText.includes("class=error")) {
                modal.find('#error-text')[0].innerHTML = rsp.responseText;
                return false;
            } else {
                modal.find('#error-text')[0].innerHTML = ""
                modal.find('#reason-text').val("")
                // Update UI after successful rejection
                var temp = jQuery3("#heading" + challengeID)
                var challengeText = temp.find("#currentChallengeText" + challengeID).html()
                if (challengeText != null) {
                    if (!challengeText.includes("You have nothing developed recently")) {
                        var appendedVal = '<tr>' +
                            '<td data-toggle="tooltip" data-placement="left" title="' + reason + '">' + challengeText + '</td>' +
                            '</tr>'
                        jQuery3("#rejectedTable").append(appendedVal)
                    }
                }
            }
            temp.parent().remove()
            modal.modal("hide")
        }
    })
})
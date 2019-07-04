$(document).ready(function() {


    $("#userInput").submit(function (event) {

        //stop submit the form, we will post it manually.
        event.preventDefault();

        fire_ajax_submit();

    });
});

function fire_ajax_submit() {

    var getName = {}
    getName["requestUserName"] = $("#inputName").val();
    var getText = {}
    getText["requestUserText"] = $("#inputText").val();
    var getCity = {}
    getCity["requestUserCity"] = $("#inputCity").val();

    $("#input").prop("disabled", true);

    $.ajax({
        type: "GET",
        ccontentType: "application/json",
        // url: "http://localhost:8080/user-info?requestUserName=LipiB&requestUserText=Hellothere!",
        url: "http://localhost:8080/user-info?requestUserName=" + getName["requestUserName"] + "&requestUserText=" +  getText["requestUserText"] + "&requestUserCity=" + getCity["&requestUserCity"],
        crossDomain: true,
    }).then(function(data) {
        $('#userdata').append($("<tr>")
            .append($("<td>").append(data.userName))
            .append($("<td>").append(data.userText))
            .append($("<td>").append(data.addedAtTime))
            .append($("<td>").append(data.userCity))
            .append($("<td>").append(data.geoLatitude))
            .append($("<td>").append(data.geoLongitude))
            .append($("<td>").append(data.temperatureCelsius)));
    });
} 
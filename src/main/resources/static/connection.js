$(document).ready(function() {


    $("#userInput").submit(function (event) {

        //stop submit the form, we will post it manually.
        event.preventDefault();

        fire_ajax_submit();

    });
});
    // var httpReq = new XMLHttpRequest();
    // var url = 'http://localhost:8080/user-info?userName=LipiB&userText=Hellothere!';
    // // var url = 'http://localhost:8080/user-info?';
    // // var fields = 'userName=LipiB&userText=Hello!&format=JSON';

    // httpReq.open('POST', url, true);
    // console.log('good');

    // httpReq.setRequestHeader('Access-Control-Allow-Headers', '*');
    // httpReq.setRequestHeader('Content-type', 'application/ecmascript');
    // httpReq.setRequestHeader('Access-Control-Allow-Origin', '*');
    
    // // httpReq.onreadystatechange = function () {
    // //     console.log('test');
    // //     if (httpReq.readyState === 4 && httpReq.status === 'success') {
    // //         console.log('test');
    // //         alert(httpReq.responseText);
    // //     }
    // // };

    // // httpReq.send(fields);

        // var getName = document.getElementById("inputName").value;
        // var getText = document.getElementById("inputText").value;
        // var getCity = document.getElementById("inputCity").value;

function fire_ajax_submit() {

        var getName = {}
        getName["requestUserName"] = $("#inputName").val();
        var getText = {}
        getText["requestUserText"] = $("#inputText").val();
        var getCity = {}
        getCity["inputCity"] = $("#inputCity").val();

        $("#input").prop("disabled", true);

    $.ajax({
        // url: "http://rest-service.guides.spring.io/greeting"
        type: "GET",    
        ccontentType: "application/json",
        // url: "http://localhost:8080/user-info?requestUserName=LipiB&requestUserText=Hellothere!",
        url: "http://localhost:8080/user-info?",
        data: JSON.stringify(getName,getText),
        crossDomain: true,
        dataType: 'json',

    }).then(function(data) {
       $('#userdata').append($("<tr>")
       .append($("<td>").append(data.userName))
       .append($("<td>").append(data.userText))
       .append($("<td>").append(data.userName))
       .append($("<td>").append(data.userText))
       .append($("<td>").append(data.userName))
       .append($("<td>").append(data.userText)));
    });
} 
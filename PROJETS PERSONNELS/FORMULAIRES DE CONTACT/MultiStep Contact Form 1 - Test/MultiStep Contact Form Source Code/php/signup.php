<?php 

$array = array('gender' => '', 'firstname' => '', 'lastname' => '', 'email' => '', 'phone' => '', 'country' => '', 'job' => '', 'heardabout' => '', 'other-comment' => '', 'genderError' => '', 'firstnameError' => '', 'lastnameError' => '', 'emailError' => '', 'phoneError' => '', 'countryError' => '', 'jobError' => '', 'heardaboutError' => '', 'other-commentError' => '', 'isSuccess' => 'false');
$emailTo = "samuel.bertin.ts2@gmail.com"; 

if ($_SERVER['REQUEST_METHOD'] == "POST") {

    if(!empty($_POST['gender'])) {
    $array['gender'] = verifyInput($_POST['gender']);
    }
    $array['firstname'] = verifyInput($_POST['firstname']);
    $array['lastname'] = verifyInput($_POST['lastname']);
    $array['email'] = verifyInput($_POST['email']);
    $array['phone'] = verifyInput($_POST['phone']);
    $array['country'] = verifyInput($_POST['country']);
    $array['job'] = verifyInput($_POST['job']);
    $array['heardabout'] = verifyInput($_POST['heardabout']);
    $array['other-comment'] = verifyInput($_POST['other-comment']);
    if(!empty($_POST['confirm'])) {
        $array['gender'] = verifyInput($_POST['confirm']);
    }

    $array["isSuccess"] = true;
    $emailText = "";

    
    if(empty($array['gender'])) {

        $array['genderError'] = "Required";
        $array["isSuccess"] = false;
    
    } else {

        $emailText .= "Gender: {$array["gender"]} \n";

    };

    if(empty($array['firstname'])) {

        $array['firstnameError'] = "*Required";
        $array["isSuccess"] = false;
    
    } else {

        $emailText .= "First Name: {$array["firstname"]} \n";

    };

    if(empty($array['lastname'])) {

        $array['lastnameError'] = "*Required";
        $array["isSuccess"] = false;
    
    } else {

        $emailText .= "Last Name: {$array["lastname"]} \n";

    };

    if(empty($array['country'])) {

        $array['countryError'] = "*Required";
        $array["isSuccess"] = false;
    
    } else {

        $emailText .= "Country: {$array["country"]} \n";

    };

    if((empty($array['job'])) || ($array['job'] == 0)) {

        $array['jobError'] = "*Required";
        $array["isSuccess"] = false;
    
    } else {

        $emailText .= "Job: {$array["job"]} \n";

    };

    if((empty($array['heardabout'])) || ($array['heardabout'] == 0) ) {

        $array['heardaboutError'] = "*Required";
        $array["isSuccess"] = false;
    
    } else {

        $emailText .= "How did you hear about us ? : {$array["heardabout"]} \n";

    };
    

    if(!isEmail($array['email'])) {

        $array['emailError'] = "*Required";
        $array['isSuccess'] = false;

    } else {

        $emailText .= "Mail: {$array['email']} \n";

    };

    if(!isPhone($array['phone']) || empty($array['phone'])) {

        $array['phoneError'] = "*Required";
        $array['isSuccess'] = false;

    } else {

        $emailText .= "Phone: {$array['phone']} \n";

    };

    $emailText .= "Other comment: {$array["other-comment"]} \n";

    if($array['isSuccess']) {

        $headers = "From: {$array["firstname"]} {$array["lastname"]} <{$array["email"]}>\r\nReply-To: {$array["email"]}";
        $emailText = wordwrap($emailText,70);
        mail($emailTo, 'Un message de votre site:' , $emailText, $headers);

    };

    echo json_encode($array);

}

function verifyInput($var) {

    $var= trim($var);
    $var = stripslashes($var);
    $var = htmlspecialchars($var);

    return $var;

};

function isEmail($var) {

    return filter_var($var, FILTER_VALIDATE_EMAIL);

};

function isPhone($var) {

    return preg_match("/^[\+0-9\-\(\)\s]*$/", $var);

};

?>

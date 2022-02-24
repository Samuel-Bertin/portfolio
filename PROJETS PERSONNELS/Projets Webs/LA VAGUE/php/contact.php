<?php

    $array = array('name' => '', 'surname' => '', 'email' => '', 'phone' => '', 'message' => '', 'nameError' => '', 'surnameError' => '', 'emailError' => '', 'phoneError' => '', 'messageError' => '', 'isSuccess' => 'false');
    $isSuccess = false;
    $emailTo = "samuel.bertin.ts2@gmail.com";

    if ($_SERVER['REQUEST_METHOD'] == "POST") {

        $array['name']= verifyInput($_POST['name']);
        $array['surname']= verifyInput($_POST['surname']);
        $array['email']= verifyInput($_POST['email']);
        $array['phone']= verifyInput($_POST['phone']);
        $array['message']= verifyInput($_POST['message']);
        $array['isSuccess'] = true;
        $emailText = "";

        if(empty($array['name'])) {

            $array['nameError'] = "*Nom requis";
            $isSuccess = false;
        
        } else {

            $emailText .= "Name: {$array["name"]} \n";

        };

        if(empty($array['surname'])) {

            $array['surnameError'] = "*Prénom requis";
            $array['isSuccess'] = false;

        } else {

            $emailText .= "Surname: {$array['surname']} \n";

        };

        if(empty($array['message'])) {

            $array['messageError'] = "*Message requis";
            $array['isSuccess'] = false;

        } else {

            $emailText .= "Message: {$array['message']} \n";

        };

        if(!isEmail($array['email'])) {

            $array['emailError'] = "*Email existant requis";
            $array['isSuccess'] = false;

        } else {

            $emailText .= "Mail: {$array['email']} \n";

        };

        if(!isPhone($array['phone'])) {

            $array['phoneError'] = "*Téléphone invalide";
            $array['isSuccess'] = false;

        } else {

            $emailText .= "Phone: {$array['phone']} \n";

        };

        if($array['isSuccess']) {

            $headers = "From: {$array["name"]} {$array["surname"]} <{$array["email"]}>\r\nReply-To: {$array["email"]}";
            $emailText = wordwrap($emailText,70);
            mail($emailTo, 'Un message de votre site:' , $emailText, $headers);

        };

        echo json_encode($array);
    };

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
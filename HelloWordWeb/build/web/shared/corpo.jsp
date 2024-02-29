<%-- 
    Document   : corpo
    Created on : 05/09/2023, 15:19:39
    Author     : a
--%>

<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Hello World Java EE</title>
        <!-- Link to Bootstrap CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
        <script type="text/javascript" src="scripts/script.js"></script>
        <style>
            #iniciar{
                    width: 20%;
                    display: block;
                    margin: auto;
            }
        </style>
        <script>
            function link() {
                document.getElementById("service").innerHTML = "Ir ao Google"
                document.getElementById("service").href = "http://google.com";
            }
            function mudaSapo() {
                document.getElementById("service").innerHTML = "Ir ao SapoPT"
                document.getElementById("service").href = "http://sapo.pt";
            }
           
        </script>
    </head>
    <body>

        <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <a class="navbar-brand" href="#" onmouseover="variaveis();">Site UFCD 10791</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav ml-auto">
                    <li class="nav-item active">
                        <a class="nav-link" href="index.jsp">Home <span class="sr-only">(current)</span></a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="tabuada.jsp">Tabuada</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#" id="service">Services</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#" id="contact">Contact</a>
                    </li>
                    
                    <li class="nav-item">
                        <a class="nav-link" href="jogo.jsp" id="jogo">Jogo</a>
                    </li>
                </ul>
            </div>
        </nav>

        <div class="container mt-5">
            <div class="jumbotron">
let total = 0;
let pedidos = 0;
let user
function jogo() {
    
   let user = prompt("");
    if(user==null)
        user = "Jogador 1";
    
       // document.getElementById('n3').innerHTML = user:+ ":  ";
    document.getElementById('dealer').innerHTML = "Dealer: ";
    let n1 = Math.floor(Math.random() * 11) + 1;
    let n2 = Math.floor(Math.random() * 11) + 1;
    document.getElementById('iniciar').hidden = true;
    document.getElementById('n1').innerHTML = n1;
    document.getElementById('n2').innerHTML = n2;
    total += n1;
    total += n2;
    document.getElementById('buttons').innerHTML =
            '<p disabled id="pedir" onclick="pedir()" class="btn btn-success" style="padding">Pedir</p>\n\
<p id="parar" onclick="dealer()" class="btn btn-danger" style="padding">Parar</p>';
}
function pedir() {
    let n = (Math.floor(Math.random() * 11) + 1);
    total += n;
    pedidos++;
    document.getElementById('n3').innerHTML += n + " ";
    if (total > 21)
    {
        perdeu();
    }
}



function perdeu() {

    if (confirm(total + " - Total :( Looooooser!!! Jogar novamente?"))
    {
        document.getElementById('iniciar').hidden = false;
        document.getElementById('pedir').hidden = true;
        document.getElementById('parar').hidden = true;
    } else {
        document.getElementById('iniciar').hidden = false;
        document.getElementById('pedir').hidden = true;
        document.getElementById('parar').hidden = true;
    }
    total = 0;
    jogadas = 0;
}



function dealer()
{
    let jogadasd = 0, totald = 0;
    do {
        let n = (Math.floor(Math.random() * 11) + 1);
        totald += n;
        document.getElementById('dealer').innerHTML += n + " ";
        if (totald > 21)
        {
            alert(document.getElementById('dealer').innerHTML + "ganhou");
            exit();
        } else if (totald > total)
        {
            perdeu();
            exit();
        }



        jogadasd++;
    } while (jogadasd < 5);
    alert(document.getElementById('dealer').innerHTML + "ganhou");
}
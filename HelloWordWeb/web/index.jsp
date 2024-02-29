
<%@include file="shared/corpo.jsp"%>


        
        <form action="HelloWorldWebServlet" method="post">
  <div class="form-group">
      <label for="email" onclick="link()">Email address</label>
    <input type="email" class="form-control" name="email" aria-describedby="emailHelp"  placeholder="Insira o seu email.." >
    <small id="emailHelp" class="form-text text-muted">A sua privacidade  é muito importante para nós, não iremos partilhar com ninguÃ©m.</small>
  </div>
  <div class="form-group">
      <label for="password" onclick="mudaSapo()">Password</label>
    <input type="password" class="form-control" name="password"  placeholder="Insira sua password..">
  </div>
            <div class="form-group">
    <label for="passwordConfirm">Confirmar Password</label>
    <input type="password" class="form-control" name="passwordConfirm" placeholder="Insira sua password novamente">
  </div>
  <div class="form-group form-check">
      <input type="checkbox" class="form-check-input" name="termos" >
    <label class="form-check-label" for="termos" >Aceito os termos e condições</label>
  </div>
  <button type="submit" class="btn btn-primary">Criar Conta</button>
  <button type="reset" class="btn  btn-outline-secundary "  >Limpar Formulário</button>
  <img src="shared/triste.jpg"  onclick= "alert('triste');" alt="alt" />
</form>


<%@include file="shared/footer.jsp" %>


$(document).ready(function(){
  $('[id $= "releaseDate"]').mask('00/00/0000');
  $('[id $= "price"]').maskMoney({prefix:'R$ ', allowNegative: false, thousands:'.', decimal:',', affixesStay: false});
});
$(document).ready(function(){
    var fonte = 16;

    $('#aumentar').click(function(){
        if(fonte <= 22){
            fonte = fonte + 1;
            $('body').css({'font-size': fonte+'px'});
        }
    });

    $('#diminuir').click(function(){
        if(fonte >= 14){
            fonte = fonte - 1;
            $('body').css({'font-size': fonte+'px'});
        }
    });
});
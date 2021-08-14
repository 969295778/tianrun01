//ceshi.js
$(document).ready(function(){
  //  alert(123);
    $("[name='username']").keyup(function(){
        //json数据，传给后台的
        var  $param={"username":this.value};
        //执行jquery的ajax
        $.ajax({
            url:"/api/likeusers",
            type:"get",
            data:$param,
            dataType:"json",
            success:function(myData){
                var str="";
                //如果查询到数据
                if(myData!=null&&myData!="null"&&myData.data.length>0){
                  for(var i=0;i<myData.data.length;i++){//循环查询到的多个数据
                      //将用户累成多个li
                      str+="<li>"+myData.data[i].username+"</li>"
                  }

                }else{
                    str="<li>查询数据失败</li>"
                }
            $("#con").html(str);




            },
            error:function(myData){alert("e")}
        });



    });
});
var id=4;

$(document).ready(function()
{
   addIntrodution(id);
   changeContent(id);
   courseClick();
})

function courseClick()
{
    $('a').click(function()
    {
    	id=$(this).attr('id');
    	addIntrodution(id);
    	changeContent(id);
    }) 
}

function addIntrodution(id)
{
    $.ajax(
			  {
				  type:"GET",
				  url:"/MINIC/course/findOne",
				  data:{"cId": id},
				  dataType:"json",
				  async: false,
				  success:function(data)
				  {
				  	  $("h3").text(data.cname);
					  $("#summary").empty();
					  var html=' ';
					  html+='<P class="summary">'+data.cintro+'</P>';
					  $("#summary").html(html);
				  }
				  
			  });
  
}
function changeContent(id)
{
   $.ajax(
			  {
				  type:"GET",
				  url:"/MINIC/unit/findUnitsOfCourse",
				  data:{"cId": id},
				  dataType:"json",
				  async: false,
				  success:function(data)
				  {

					  $("#content").empty();
					  var html=' ';
					  var num=0;
					  var flag=0;
                      
					 $.each(data,function(commentIndex,comment)
					 	{
					 		if(num%3==0)
					 		{
					 			flag=0;
					 			html+='<div class="row">';
					 		}
					 	   html+='<div class="column1"><p class="Uname">'+comment['uName']+'</p></div>'
					 	         +'<div class="column2"><div class="learn"><a href="UnitLearn.html" class="learnWord">'
					 	         +'Learn'+'</a></div><img src="images/unit'+(num%6+1)+'.png"></div>';

					 	   if(num%3==2)
						     {
						     	flag=1;
						     	html+='</div>';
						     }

						   num++;
							
					 	});
						  
					  if(flag==0)
					  	html+='</div>';
					  $("#content").html(html);					   
				  }				  
			  }); 
}
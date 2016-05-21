
//首页导航

$(function()

{
	$(".navigation0").hover(function()
       {
         $(this).find(".navigation1").css("display","inline");
       },
       function()
       {
          $(this).find(".navigation1").css("display","none");
       }
		)
})


//文件页导航，第一栏

/*$(function()
{
	$(".book1").click(function()
	{
		if($(this).find(".book3").attr("display")=="none")
		{
			//$(this).css("background-color","#f5610b");
			$(this).find(".book3").css("display","inline");
		}
		else
		{
			//$(this).css("background-color","#ffffff");
			$(this).find(".book3").css("display","none");
		}
		
	})
})*/

$(function()
{
	$(".book1").click(function()
	{
		
		$(this).find(".book11").toggle("slow");
		
	})

	$(".book2").click(function()
	{
		
		$(this).find(".book22").toggle("slow");
		
	})

	$(".book3").click(function()
	{
		
		$(this).find(".book33").toggle("slow");
		
	})

	$(".book4").click(function()
	{
		
		$(this).find(".book44").toggle("slow");
		
	})

	$(".book5").click(function()
	{
		
		$(this).find(".book55").toggle("slow");
		
	})

	$(".book6").click(function()
	{
		
		$(this).find(".book66").toggle("slow");
		
	})

	$(".book7").click(function()
	{
		
		$(this).find(".book77").toggle("slow");
		
	})

	$(".book8").click(function()
	{
		
		$(this).find(".book88").toggle("slow");
		
	})
})
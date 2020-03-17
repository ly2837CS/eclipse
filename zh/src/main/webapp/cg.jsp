<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>成功,----------${user.uname }</h1>
</body>
</html>
<script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
<script type="text/javascript">

	$(function(){
		xx(1);
	})

	function xx(pageIndex){
		var url = "fenye/"+pageIndex+"/"+4;
		alert(url);
		$.post(url,function(data){
			$.each(data,function(i,e){
				alert(e.uname);
			})
		})
	}
</script>
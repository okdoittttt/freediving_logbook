<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<%@ page session="false" %>
<html>
<head>
	<title>Div Logbook</title>
	
	<!-- Bootstrap Core CSS -->
    <link href="resources/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- MetisMenu CSS -->
    <link href="resources/vendor/metisMenu/metisMenu.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="resources/dist/css/sb-admin-2.css" rel="stylesheet">

    <!-- Morris Charts CSS -->
    <link href="resources/vendor/morrisjs/morris.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="resources/vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
</head>
<body>

    <div id="wrapper">
        <div class="panel panel-default" style="background-image: url(resources/img/mainimg.jpg);">
            <div class="panel-heading">
                <i class="fa fa-clock-o fa-fw"></i> Div Logbook
            </div>
            <!-- /.panel-heading -->
            <div class="panel-body">
                <ul class="timeline">
                    <li>
                        <div class="timeline-badge info"><i class="fa fa-check"></i>
                        </div>
                        <div class="timeline-panel" style="background-color: aliceblue;">
                            <div class="timeline-heading">
                                <h4 class="timeline-title">스노쿨링 로그</h4>
                                <p>수심 0~5m 이내</p>
                                </p>
                            </div>
                            <div class="timeline-body">
                                <p>스노쿨리한 곳에서의 다이빙 로그입니다. 낮은 수심에서 보았던 아름다운 물고기와 동물을을 기록하고, 그날의 날씨, 수온, 파도 등을 기록해 다음 스노쿨링에 좋은 정보를 제공할 수 있습니다.</p>
                                <hr>
                                <button onclick="location.href='/controller/board/list'" type="button" class="btn btn-info">&nbsp;&nbsp;기록&nbsp;&nbsp;</button>
                        </div>
                    </li>
                    <br><br><br><br><br><br><br><br><br><br><br><br><br>
                        <li class="timeline-inverted">
                            <div class="timeline-badge success"><i class="fa fa-check"></i>
                            </div>
                            <div class="timeline-panel" style="background-color: aliceblue;">
                                <div class="timeline-heading">
                                    <h4 class="timeline-title">펀 다이빙 로그</h4>
                                    <p>수심 5~20m 이내</p>
                            </div>
                            <div class="timeline-body">
                                <p>가벼운 펀 다이빙 로그북입니다. 가볍게 즐긴 펀 다이빙에 대한 정보를 기록하세요. 그날의 날씨, 수언, 파도 등을 기록하고 호흡과 신체 반응에 대해 정밀하게 기록하면 더욱 깊은 수심으로 내려갈 때 도움이 될 수 있습니다.</p>
                                <hr>
                                <button onclick="location.href='/controller/board/flist'" type="button" class="btn btn-success">&nbsp;&nbsp;기록&nbsp;&nbsp;</button>
                        </div>
                    </li>

                    <br><br><br><br><br><br><br><br><br><br><br><br><br>
                    <li>
                        <div class="timeline-badge danger"><i class="fa fa-flag"></i>
                        </div>
                        <div class="timeline-panel" style="background-color: aliceblue;">
                            <div class="timeline-heading">
                                <h4 class="timeline-title">딥 다이빙 로그</h4>
                                <p>수심 20m 이상</p>
                            </div>
                            <div class="timeline-body">
                                <p>20m 이상의 수심에서 활동을 기록하세요. 더 깊은 곳으로 향하기 위한 좋은 정보를 기록해두세요. 다음 도전에서 안전하게 수면 위로 올라올 수 있기 위해 오늘의 정보를 세밀하게 기록해 두어야 합니다.</p>
                                <hr>
                                <button onclick="location.href='/controller/board/dlist'" type="button" class="btn btn-danger">&nbsp;&nbsp;기록&nbsp;&nbsp;</button>
                            </div>
                        </div>
                    </li>
                    <li class="timeline-inverted">
                        <div class="timeline-badge success"><i class="fa fa-user"></i>
                        </div>
                        <div class="timeline-panel" style="background-color: aliceblue;">
                            <div class="timeline-heading">
                                <h4 class="timeline-title">다비빙 버디</h4>
                            </div>
                            <div class="timeline-body">
                                <p>프리 다이빙은 혼자 할 수 없는 스포츠 입니다. 소중한 버디의 정보를 기록하고 함께 즐길 수 있도록 하세요.</p>
                                <hr>
                                <button onclick="location.href='/controller/board/budylist'" type="button" class="btn btn-success">&nbsp;&nbsp;버디&nbsp;&nbsp;</button>
                            </div>
                        </div>
                    </li>
                </ul>
            </div>
            <!-- /.panel-body -->
        </div>
        <!-- /.panel -->
    </div>
    <!-- /#wrapper -->

    <!-- jQuery -->
    <script src="resources/vendor/jquery/jquery.min.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="resources/vendor/bootstrap/js/bootstrap.min.js"></script>

    <!-- Metis Menu Plugin JavaScript -->
    <script src="resources/vendor/metisMenu/metisMenu.min.js"></script>

    <!-- Morris Charts JavaScript -->
    <script src="resources/vendor/raphael/raphael.min.js"></script>
    <script src="resources/vendor/morrisjs/morris.min.js"></script>
    <script src="resources/data/morris-data.js"></script>

    <!-- Custom Theme JavaScript -->
    <script src="resources/dist/js/sb-admin-2.js"></script>
</body>
</html>

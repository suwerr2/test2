<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../include/topAdmin.jsp" %>	


		<!-- contents -->
		<div class="mrContainer">
			<div class="contents">
				<div class="titleWrap">
					<h2 class="testBtn floatL">관리자 곡선택 노출관리</h2>
				</div>
				<div class="conArea">
					<div class="accuntArea">
						<input type="radio" id="musicChoice" name="musicChoice"><label for="01">작곡</label>
						<input type="radio" id="musicChoice" name="musicChoice"><label for="02">편곡중인</label>
						<input type="radio" id="musicChoice" name="musicChoice"><label for="03">편곡완료</label>
						<input type="radio" id="musicChoice" name="musicChoice"><label for="04">보컬음원</label>
						<input type="radio" id="musicChoice" name="musicChoice"><label for="05">차트 추천음악</label><br>
						<div class="mt20 ml10">
							<input type="text" placeholder="E-mail입력" style="width: 200px;">
							<a class="btn" href="#none"><span>찾기</span></a>
						</div>
					</div>
					<div class="mt30" style="float: left; width: 45%">
						<select id='bComps' multiple='multiple' name="" multiple size="10" class="selectType1">
							<option value="">너에게로 가는길1</option>
							<option value="">너에게로 가는길2</option>
							<option value="">너에게로 가는길3</option>
							<option value="">너에게로 가는길4</option>
							<option value="">너에게로 가는길5</option>
							<option value="">너에게로 가는길1</option>
							<option value="">너에게로 가는길2</option>
							<option value="">너에게로 가는길3</option>
							<option value="">너에게로 가는길4</option>
							<option value="">너에게로 가는길5</option>
							<option value="">너에게로 가는길1</option>
							<option value="">너에게로 가는길2</option>
							<option value="">너에게로 가는길3</option>
							<option value="">너에게로 가는길4</option>
							<option value="">너에게로 가는길5</option>
							<option value="">너에게로 가는길1</option>
							<option value="">너에게로 가는길2</option>
							<option value="">너에게로 가는길3</option>
							<option value="">너에게로 가는길4</option>
							<option value="">너에게로 가는길5</option>
							<option value="">너에게로 가는길1</option>
							<option value="">너에게로 가는길2</option>
							<option value="">너에게로 가는길3</option>
							<option value="">너에게로 가는길4</option>
							<option value="">너에게로 가는길5</option>
							<option value="">너에게로 가는길1</option>
							<option value="">너에게로 가는길2</option>
							<option value="">너에게로 가는길3</option>
							<option value="">너에게로 가는길4</option>
							<option value="">너에게로 가는길5</option>
							<option value="">너에게로 가는길1</option>
							<option value="">너에게로 가는길2</option>
							<option value="">너에게로 가는길3</option>
							<option value="">너에게로 가는길4</option>
							<option value="">너에게로 가는길5</option>
							<option value="">너에게로 가는길1</option>
							<option value="">너에게로 가는길2</option>
							<option value="">너에게로 가는길3</option>
							<option value="">너에게로 가는길4</option>
							<option value="">너에게로 가는길5</option>							
						</select>

		            </div>
		            
		            <div class="arrowArea">
		            	<p><a href="#none" id='btnLToR' ><img src="../resources/images/bul_arrowRight.gif" alt="right"></a></p>
		                <p><a href="#none" id='btnRToL' ><img src="../resources/images/bul_arrowLeft.gif" alt="left"></a></p>
		                <p><a href="#none" id='btnMoveUp' ><img src="../resources/images/bul_arrowUp.gif" alt="up"></a></p>
		                <p><a href="#none" id='btnMoveDown'><img src="../resources/images/bul_arrowDown.gif" alt="down"></a></p>
		            </div>
		            
		            <div class="mt30" style="float: left; width: 45%">
						<select  id='aComps' multiple='multiple' name="" size="10" class="selectType1">
							<option value="">너에게로 가는길6</option>
							<option value="">너에게로 가는길7</option>
							<option value="">너에게로 가는길8</option>
							<option value="">너에게로 가는길9</option>
						</select>
		            </div>
				</div>
				<div class="btnAreaType01">
                	<div class="textR">
	                    <a class="btn large" href="#none"><span>저장</span></a>
	                </div>
                </div>
			</div>

		</div>
		<!-- //contents -->
		
<%@ include file="../include/bottom.jsp" %>


<script type="text/javascript">
// 달력
	$(function(){    
	    //-- 왼쪽 -> 오른쪽 이동 
	    $('#btnLToR').click(function(event)  
	    {  
	       $("#bComps option:selected").each(function() 
	       {     
	          if($(this).index!=0) 
	          {     
	              $(this).appendTo("#aComps");
	      }  
	       });
	       // alert($("#aComps").val()); -- 이동확인 
	     }); 

	     //-- 오른쪽 -> 왼쪽 이동 
	     $("#btnRToL").click(function(event)  
	     {  
	        $("#aComps option:selected").each(function()  
	        {     
	           if($(this).index!=0) 
	           {     
	              $(this).appendTo("#bComps");     
	           }  
	        });  
	        // alert($("#bComps").val()); -- 이동확인 
	     }); 

	    //-- 위로 
	    $("#btnMoveUp").click(function() 
	    {  
	       $('#aComps option:selected').each(function() 
	       {   
	          var selectObj = $(this);   
	          if(selectObj.index() == 0 ) { return false; }
	        var targetObj = $('#aComps option:eq('+(selectObj.index()-1)+')');   
	          targetObj.before(selectObj);
	       }); 
	     }); 

	     //-- 아래 
	     $("#btnMoveDown").click(function() 
	     {  
	        $('#aComps option:selected').each(function()
	        {   
	           var selectObj = $(this);
	     if(selectObj.index() == $('#aComps').children().length ) { return false; }       
	           var targetObj = $('#aComps option:eq('+(selectObj.index()+1)+')');
	    		targetObj.after(selectObj);
	        }); 
	      });
	     
	 	$('#bComps').click(function() {
	        $('#aComps option').attr('selected', false);
		});
		
		$('#aComps').click(function() {
	        $('#bComps option').attr('selected', false);
		});
	     
	});


	
</script>
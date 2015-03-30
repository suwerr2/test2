	//앨범라인 자동생성
	var AutoAddLine = function(){};
	
	//AutoAddLine 변수선언.
	AutoAddLine.load_cnt = "";
	AutoAddLine.scroll_able = "";
	AutoAddLine.scrollOK = "";
	AutoAddLine.scrollLock = "";
	AutoAddLine.menu = "";
	
	AutoAddLine.url = "";
	AutoAddLine.page = "";	
	AutoAddLine.orderby = "";
	AutoAddLine.genreNo = "";
	AutoAddLine.pageon = "";
	AutoAddLine.searchWord = "";
	AutoAddLine.isSearch = "";
	AutoAddLine.memberNo = "";	
	
	
	//메소드 정의
	AutoAddLine.addRowTypeEmpty = function(){};
	AutoAddLine.prototype.addRowTypeEmpty = function(){
		$(".arrList").empty();
	}	

	AutoAddLine.noData = function(){};		
	AutoAddLine.prototype.noData = function(){

        $(".arrList").append(
        		"<li class='secType1 oh'>" + 
        		"<div class='coverArt'>" +
        		"등록된 음원이 없거나 해당 장르에 음원이 없습니다." +	
        		"</div>" +
        		"</li>"      		        		
        );  		

	}	

	
	//JSON이용한 리스트 받아오기.
	AutoAddLine.arrangement_list = function(){};
	AutoAddLine.prototype.arrangement_list = function(){
			
		   $.getJSON(AutoAddLine.url, function(data) {
			   
			   	  AutoAddLine.menu = data['listType'];

	              $.each(data, function(key, state){

	            	  if(key=='totalPage'){
	            		  if(state<=0){
	            			  AutoAddLine.addRow_End_Mark();	            			  
	            			  AutoAddLine.scrollLock=true;
	            		  }
	            	  }
	            	  
	            	  if(key=='objects'){  //objects만 추출
	            		  $.each(state, function(key2, state2){
	            			  
								AutoAddLine.addRow(state2);   //곡 리스트 가져오기		
								
	            		  })	            		  
	            	  }
	              });
	          });

	         AutoAddLine.scroll_again();
	};

	// 스크롤 이벤트 중복발생 방지용 (릴레이).	
	AutoAddLine.scroll_again = function(){};	
	AutoAddLine.prototype.scroll_again = function(){
		var timer = setInterval(function(){
			AutoAddLine.scrollOK = true;
		}, 3600);
	};

	//더 이상 불러올 데이터 없음 표시
    AutoAddLine.addRow_End_Mark = function(){};
    AutoAddLine.prototype.addRow_End_Mark = function(){
        $(".arrList").append(
                "<div class='textC mt30'>" +
                " 더 이상 데이터가 없습니다." + 
                "</div>"
        );
    };
      
    
	//더 이상 불러올 데이터 없음 표시 - 삭제
    AutoAddLine.lodingbars_end = function(cnt){};
    AutoAddLine.prototype.lodingbars_end = function(cnt){
  	  jQuery('#more'+cnt).fadeOut(2000).delay(5000);    	
    };
    
    
    //로딩중 이미지
    AutoAddLine.lodingbars = function(cnt){};
    AutoAddLine.prototype.lodingbars = function(cnt){
     	  var newDiv=document.createElement('div');
      	  newDiv.setAttribute('class','textC');
      	  newDiv.setAttribute('id','more'+cnt);
      	  
      	  newDiv.innerHTML="<img src='../resources/images/arrage/bul_h3.gif' alt=''> 데이터를 불러오는중입니다.";
      	  $(newDiv).insertAfter($(".arrList"));
    };    

    
	/*패키지 추자  및 클래스 정의*/ 
	var AutoAddLine_event = {};
	AutoAddLine_event.Event = {};
	AutoAddLine_event.Event.InfiniteScroll = function(scrollArrange, callback){
		this.scrollArrange = scrollArrange;
		this.callback = callback;
	};
	
	//이벤트 메소드.
	AutoAddLine_event.Event.InfiniteScroll.prototype =  {
		beginScroll: function() {
			AutoAddLine.scrollOK=false;												
			if(AutoAddLine.scroll_able==true){
				
				AutoAddLine.scroll_able=false;
				
				   setTimeout(function(){
						AutoAddLine.arrangement_list(); //리스트 받아오기
                       new $$close_loop_progress();							
					   }, 500);

						AutoAddLine.load_cnt++;
						AutoAddLine.scroll_able=true;
						AutoAddLine.pageon = true;					
			}			
		},
		stopScroll : function(){
			AutoAddLine.scroll_able=false;				
		}
	};
	

    //sound list append	    
	$(window).scroll(function(){
		if(AutoAddLine.scrollOK==true){
	
			if(AutoAddLine.scrollLock==false){
				
				var pageBottom = ($(document).height() - $(window).height());
			
				if($(window).scrollTop() >= pageBottom - 150){
					if(AutoAddLine.pageon==1){												
						AutoAddLine.callScroll();
					}
				}
			
			}
		}	
		
	});	

	

    

	
	
	
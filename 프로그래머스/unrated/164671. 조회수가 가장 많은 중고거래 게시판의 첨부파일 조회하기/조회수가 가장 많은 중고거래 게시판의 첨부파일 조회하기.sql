-- 코드를 입력하세요
SELECT concat("/home/grep/src/",b.BOARD_ID,"/",f.FILE_ID,f.FILE_NAME,f.FILE_EXT) 
from USED_GOODS_BOARD b 
left join USED_GOODS_FILE f 
on b.BOARD_ID=f.BOARD_ID
where b.views=(select max(VIEWS) from USED_GOODS_BOARD);



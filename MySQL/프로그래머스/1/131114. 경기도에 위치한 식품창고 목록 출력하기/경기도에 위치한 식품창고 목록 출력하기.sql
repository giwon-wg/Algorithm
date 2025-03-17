-- 코드를 입력하세요
SELECT FW.WAREHOUSE_ID, FW.WAREHOUSE_NAME, FW.ADDRESS, IFNULL(FW.FREEZER_YN, 'N') AS FREEZER_YN
from FOOD_WAREHOUSE FW
where FW.ADDRESS like '%경기도%'
order by FW.WAREHOUSE_ID
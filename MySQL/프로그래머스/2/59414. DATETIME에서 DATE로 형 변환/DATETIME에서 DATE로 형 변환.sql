-- 코드를 입력하세요
SELECT AI.ANIMAL_ID, AI.NAME, DATE_FORMAT(DATETIME, '%Y-%m-%d') AS 날짜
from ANIMAL_INS AI
order by ANIMAL_ID
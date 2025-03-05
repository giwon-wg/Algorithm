-- 코드를 입력하세요
SELECT AI.ANIMAL_ID, AI.NAME
from ANIMAL_INS AI
where AI.NAME like '%EL%' and AI.ANIMAL_TYPE ='Dog'
order by AI.NAME 
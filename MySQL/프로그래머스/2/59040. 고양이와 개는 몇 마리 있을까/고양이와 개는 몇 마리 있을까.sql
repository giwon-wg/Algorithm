-- 코드를 입력하세요
SELECT AI.ANIMAL_TYPE, count(*) as count
from ANIMAL_INS AI
group by AI.ANIMAL_TYPE
order by AI.ANIMAL_TYPE
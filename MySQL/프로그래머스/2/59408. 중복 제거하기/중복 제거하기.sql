-- 코드를 입력하세요
SELECT count(distinct(AI.NAME)) as conut
from ANIMAL_INS AI
where AI.NAME is not null
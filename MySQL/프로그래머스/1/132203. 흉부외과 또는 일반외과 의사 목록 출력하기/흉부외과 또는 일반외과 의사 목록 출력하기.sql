-- 코드를 입력하세요
SELECT D.DR_NAME, D.DR_ID, D.MCDP_CD, date_format(D.HIRE_YMD, '%Y-%m-%d') as HIRE_YMD
from DOCTOR D
where D.MCDP_CD = 'CS' or D.MCDP_CD = 'GS'
order by D.HIRE_YMD desc, D.DR_NAME;
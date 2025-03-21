-- 코드를 입력하세요
SELECT COUNT(UI.USER_ID) AS USERS
from USER_INFO UI
where year(UI.JOINED) = 2021 and UI.AGE between 20 and 29;

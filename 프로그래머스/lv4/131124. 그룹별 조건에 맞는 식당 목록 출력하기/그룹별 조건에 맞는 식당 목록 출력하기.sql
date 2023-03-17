

select m.MEMBER_NAME, r.review_text,DATE_FORMAT(r.review_date,'%Y-%m-%d') as review_date
from rest_review as r 
join MEMBER_PROFILE as m on m.MEMBER_ID=r.MEMBER_ID
where r.member_id=(
select member_id from rest_review group by member_id
order by count(*) desc limit 1)
order by r.review_date,r.REVIEW_TEXT;


# where r.member_id=(select member_id from rest_review where max(member_id));
# count(*) as c, member_id
# group by member_id;


# select max(count(*)) from rest_review as r join member_profile as m on m.member_id=r.member_id group by m.member_name;
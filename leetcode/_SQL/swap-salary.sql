# Write your MySQL query statement below

UPDATE
    salary s
SET
    s.sex = (
        CASE
            WHEN
                s.sex = 'f'
            THEN
                'm'
            ELSE
                'f'
        END
    )
;

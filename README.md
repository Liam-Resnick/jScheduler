# student-scheduler

This study applied SAT4j, a heuristic-based satisfiability solver, to optimize the NP-hard
scheduling optimization problem broadly, and the process of assigning courses to students
specifically. I designed a conjunctive-normal-form (CNF) formula to capture diverse requirements
for both students and courses, used SAT4j to search for satisfying
solutions, and processed the results in a user-friendly format. When evaluated against a brute-force search, there was a roughly 6x speed-up using
typical class-sizes.

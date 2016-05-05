function getGrade(s1, s2, s3) {
    var score = Math.round((s1 + s2 + s3) / 3);
    console.log(score)
    if (score < 60)
        return 'F';

    if (score < 70)
        return 'D';

    if (score < 80)
        return 'C';

    if (score < 90)
        return 'B';

    if (score <= 100)
        return 'A';
}
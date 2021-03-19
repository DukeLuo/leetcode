function romanToInt(s: string): number {
    let integer = 0;
    if (!s.length) {
        return integer;
    }
    const romanToInt = {
        I: 1,
        V: 5,
        X: 10,
        L: 50,
        C: 100,
        D: 500,
        M: 1000,
    };
    for (let i = s.length - 1; i >= 0; i--) {
        let lastIndex = i + 1 === s.length ? i : i + 1;
        if (romanToInt[s[i]] < romanToInt[s[lastIndex]]) {
            integer = integer - romanToInt[s[i]];
        } else {
            integer = integer + romanToInt[s[i]];
        }
    }
    return integer;
}
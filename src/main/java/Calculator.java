public class Calculator {
    public int Calculate(String from, String to, int size, int weight) throws Exception {
        if ("茨城県".equals(from) || "栃木県".equals(from) || "群馬県".equals(from) ||
            "埼玉県".equals(from) || "千葉県".equals(from) || "神奈川県".equals(from) ||
            "東京都".equals(from) || "山梨県".equals(from))
        {
            if ("北海道".equals(to)) {
                if (size <= 60 && weight <= 2) {
                    return 1370;
                } else if (size <= 80 && weight <= 5) {
                    return 1590;
                } else if (size <= 100 && weight <= 10) {
                    return 1830;
                } else if (size <= 120 && weight <= 15) {
                    return 2050;
                } else if (size <= 140 && weight <= 20) {
                    return 2290;
                } else if (size <= 160 && weight <= 25) {
                    return 2510;
                }
            } else if ("青森".equals(to) || "秋田".equals(to) || "岩手".equals(to)) {
                if (size < 60 && weight <= 2) {
                    return 1040;
                } else if (size <= 80 && weight <= 5) {
                    return 1260;
                } else if (size <= 100 && weight <= 10) {
                    return 1500;
                } else if (size <= 120 && weight <= 15) {
                    return 1720;
                } else if (size <= 140 && weight <= 20) {
                    return 1960;
                } else if (size <= 160 && weight <= 25) {
                    return 2180;
                }
            }
        }
        throw new Exception("未定義です");
    }
}

package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
abstract class YM0 {
    static String a(AbstractC5231tL0 abstractC5231tL0) {
        StringBuilder sb = new StringBuilder(abstractC5231tL0.j());
        for (int i10 = 0; i10 < abstractC5231tL0.j(); i10++) {
            byte bG = abstractC5231tL0.g(i10);
            if (bG == 34) {
                sb.append("\\\"");
            } else if (bG == 39) {
                sb.append("\\'");
            } else if (bG != 92) {
                switch (bG) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bG < 32 || bG > 126) {
                            sb.append('\\');
                            sb.append((char) (((bG >>> 6) & 3) + 48));
                            sb.append((char) (((bG >>> 3) & 7) + 48));
                            sb.append((char) ((bG & 7) + 48));
                        } else {
                            sb.append((char) bG);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }
}

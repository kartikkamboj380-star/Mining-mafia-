package p006a5;

import com.google.android.gms.common.api.CommonStatusCodes;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c extends CommonStatusCodes {
    public static String getStatusCodeString(int i10) {
        switch (i10) {
            case 12500:
                return "A non-recoverable sign in failure occurred";
            case 12501:
                return "Sign in action cancelled";
            case 12502:
                return "Sign-in in progress";
            default:
                return CommonStatusCodes.getStatusCodeString(i10);
        }
    }
}

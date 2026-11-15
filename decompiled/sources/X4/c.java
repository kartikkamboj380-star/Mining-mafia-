package X4;

import android.content.Intent;
import com.google.android.gms.auth.UserRecoverableAuthException;

/* JADX INFO: loaded from: classes2.dex */
public class c extends UserRecoverableAuthException {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f6680d;

    c(int i10, String str, Intent intent) {
        super(str, intent);
        this.f6680d = i10;
    }
}

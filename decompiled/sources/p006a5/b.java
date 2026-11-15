package p006a5;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes2.dex */
public class b implements Result {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Status f7279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final GoogleSignInAccount f7280b;

    public b(GoogleSignInAccount googleSignInAccount, Status status) {
        this.f7280b = googleSignInAccount;
        this.f7279a = status;
    }

    public GoogleSignInAccount a() {
        return this.f7280b;
    }

    @Override // com.google.android.gms.common.api.Result
    public Status getStatus() {
        return this.f7279a;
    }
}

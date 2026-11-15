package Y4;

import android.os.Bundle;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class g implements Api.ApiOptions.Optional {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g f6889d = new g(new f());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f6890a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f6891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f6892c;

    public g(f fVar) {
        this.f6891b = fVar.f6887a.booleanValue();
        this.f6892c = fVar.f6888b;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("consumer_package", null);
        bundle.putBoolean("force_save_dialog", this.f6891b);
        bundle.putString("log_session_id", this.f6892c);
        return bundle;
    }

    final /* synthetic */ boolean b() {
        return this.f6891b;
    }

    final /* synthetic */ String c() {
        return this.f6892c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        String str = gVar.f6890a;
        return Objects.equal(null, null) && this.f6891b == gVar.f6891b && Objects.equal(this.f6892c, gVar.f6892c);
    }

    public final int hashCode() {
        return Objects.hashCode(null, Boolean.valueOf(this.f6891b), this.f6892c);
    }
}

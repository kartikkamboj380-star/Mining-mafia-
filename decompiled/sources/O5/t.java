package O5;

import android.os.Bundle;
import p176r5.C7094k;

/* JADX INFO: loaded from: classes2.dex */
final class t extends s {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f4542d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ u f4543e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    t(u uVar, C7094k c7094k, String str) {
        super(uVar, new P5.p("OnRequestInstallCallback"), c7094k);
        this.f4543e = uVar;
        this.f4542d = str;
    }

    @Override // O5.s, P5.m
    public final void h5(Bundle bundle) {
        super.h5(bundle);
        if (bundle.getInt("error.code", -2) != 0) {
            this.f4540b.d(new R5.a(bundle.getInt("error.code", -2)));
        } else {
            this.f4540b.e(u.d(this.f4543e, bundle, this.f4542d));
        }
    }
}

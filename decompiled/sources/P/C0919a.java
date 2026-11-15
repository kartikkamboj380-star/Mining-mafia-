package P;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: renamed from: P.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0919a extends ClickableSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f4641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final A f4642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f4643c;

    public C0919a(int i10, A a10, int i11) {
        this.f4641a = i10;
        this.f4642b = a10;
        this.f4643c = i11;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f4641a);
        this.f4642b.g0(this.f4643c, bundle);
    }
}

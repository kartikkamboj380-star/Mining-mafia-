package J0;

import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WebSettingsBoundaryInterface f1926a;

    public z(WebSettingsBoundaryInterface webSettingsBoundaryInterface) {
        this.f1926a = webSettingsBoundaryInterface;
    }

    public void a(int i10) {
        this.f1926a.setForceDark(i10);
    }

    public void b(int i10) {
        this.f1926a.setForceDarkBehavior(i10);
    }

    public void c(boolean z9) {
        this.f1926a.setPaymentRequestEnabled(z9);
    }
}

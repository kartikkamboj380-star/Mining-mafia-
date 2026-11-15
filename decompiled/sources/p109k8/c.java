package p109k8;

import B4.f;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.AdRequest;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class c extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AdRequest f45683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f45684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f45685c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f45686d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f45687e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f45688f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f45689g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f45690h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Runnable f45691i;

    public c(Context context) {
        super(context);
        this.f45691i = new Runnable() { // from class: k8.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f45682a.b();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        measure(View.MeasureSpec.makeMeasureSpec(getWidth(), 1073741824), this.f45690h ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(getHeight(), 1073741824));
        layout(getLeft(), getTop(), getRight(), getTop() + getHeight());
    }

    public float getAdWidth() {
        return this.f45686d;
    }

    public boolean getIsFluid() {
        return this.f45690h;
    }

    public boolean getManualImpressionsEnabled() {
        return this.f45688f;
    }

    public float getMaxAdHeight() {
        return this.f45685c;
    }

    public boolean getPropsChanged() {
        return this.f45689g;
    }

    public AdRequest getRequest() {
        return this.f45683a;
    }

    public List<f> getSizes() {
        return this.f45684b;
    }

    public String getUnitId() {
        return this.f45687e;
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
        post(this.f45691i);
    }

    public void setAdWidth(float f10) {
        this.f45686d = f10;
    }

    public void setIsFluid(boolean z9) {
        this.f45690h = z9;
    }

    public void setManualImpressionsEnabled(boolean z9) {
        this.f45688f = z9;
    }

    public void setMaxAdHeight(float f10) {
        this.f45685c = f10;
    }

    public void setPropsChanged(boolean z9) {
        this.f45689g = z9;
    }

    public void setRequest(AdRequest adRequest) {
        this.f45683a = adRequest;
    }

    public void setSizes(List<f> list) {
        this.f45684b = list;
    }

    public void setUnitId(String str) {
        this.f45687e = str;
    }
}

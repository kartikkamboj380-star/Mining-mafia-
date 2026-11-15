package O;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import com.google.android.gms.common.api.Api;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: renamed from: O.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0868o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f3849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC0870p f3850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f3851c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f3852d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private VelocityTracker f3853e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f3854f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f3855g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f3856h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f3857i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int[] f3858j;

    /* JADX INFO: renamed from: O.o$a */
    interface a {
        float a(VelocityTracker velocityTracker, MotionEvent motionEvent, int i10);
    }

    /* JADX INFO: renamed from: O.o$b */
    interface b {
        void a(Context context, int[] iArr, MotionEvent motionEvent, int i10);
    }

    public C0868o(Context context, InterfaceC0870p interfaceC0870p) {
        this(context, interfaceC0870p, new b() { // from class: O.m
            @Override // O.C0868o.b
            public final void a(Context context2, int[] iArr, MotionEvent motionEvent, int i10) {
                C0868o.c(context2, iArr, motionEvent, i10);
            }
        }, new a() { // from class: O.n
            @Override // O.C0868o.a
            public final float a(VelocityTracker velocityTracker, MotionEvent motionEvent, int i10) {
                return C0868o.f(velocityTracker, motionEvent, i10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(Context context, int[] iArr, MotionEvent motionEvent, int i10) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        iArr[0] = AbstractC0851f0.i(context, viewConfiguration, motionEvent.getDeviceId(), i10, motionEvent.getSource());
        iArr[1] = AbstractC0851f0.h(context, viewConfiguration, motionEvent.getDeviceId(), i10, motionEvent.getSource());
    }

    private boolean d(MotionEvent motionEvent, int i10) {
        int source = motionEvent.getSource();
        int deviceId = motionEvent.getDeviceId();
        if (this.f3856h == source && this.f3857i == deviceId && this.f3855g == i10) {
            return false;
        }
        this.f3851c.a(this.f3849a, this.f3858j, motionEvent, i10);
        this.f3856h = source;
        this.f3857i = deviceId;
        this.f3855g = i10;
        return true;
    }

    private float e(MotionEvent motionEvent, int i10) {
        if (this.f3853e == null) {
            this.f3853e = VelocityTracker.obtain();
        }
        return this.f3852d.a(this.f3853e, motionEvent, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static float f(VelocityTracker velocityTracker, MotionEvent motionEvent, int i10) {
        Z.a(velocityTracker, motionEvent);
        Z.b(velocityTracker, 1000);
        return Z.d(velocityTracker, i10);
    }

    public void g(MotionEvent motionEvent, int i10) {
        boolean zD = d(motionEvent, i10);
        if (this.f3858j[0] == Integer.MAX_VALUE) {
            VelocityTracker velocityTracker = this.f3853e;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f3853e = null;
                return;
            }
            return;
        }
        float fE = e(motionEvent, i10) * this.f3850b.b();
        float fSignum = Math.signum(fE);
        float f10 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (zD || (fSignum != Math.signum(this.f3854f) && fSignum != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) {
            this.f3850b.c();
        }
        float fAbs = Math.abs(fE);
        int[] iArr = this.f3858j;
        if (fAbs < iArr[0]) {
            return;
        }
        int i11 = iArr[1];
        float fMax = Math.max(-i11, Math.min(fE, i11));
        if (this.f3850b.a(fMax)) {
            f10 = fMax;
        }
        this.f3854f = f10;
    }

    C0868o(Context context, InterfaceC0870p interfaceC0870p, b bVar, a aVar) {
        this.f3855g = -1;
        this.f3856h = -1;
        this.f3857i = -1;
        this.f3858j = new int[]{Api.BaseClientBuilder.API_PRIORITY_OTHER, 0};
        this.f3849a = context;
        this.f3850b = interfaceC0870p;
        this.f3851c = bVar;
        this.f3852d = aVar;
    }
}

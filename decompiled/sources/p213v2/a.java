package p213v2;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    InterfaceC0548a f50110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final float f50111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f50112c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    boolean f50113d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    long f50114e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    float f50115f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    float f50116g;

    /* JADX INFO: renamed from: v2.a$a, reason: collision with other inner class name */
    public interface InterfaceC0548a {
        boolean b();
    }

    public a(Context context) {
        this.f50111b = ViewConfiguration.get(context).getScaledTouchSlop();
        a();
    }

    public static a c(Context context) {
        return new a(context);
    }

    public void a() {
        this.f50110a = null;
        e();
    }

    public boolean b() {
        return this.f50112c;
    }

    public boolean d(MotionEvent motionEvent) {
        InterfaceC0548a interfaceC0548a;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f50112c = true;
            this.f50113d = true;
            this.f50114e = motionEvent.getEventTime();
            this.f50115f = motionEvent.getX();
            this.f50116g = motionEvent.getY();
        } else if (action == 1) {
            this.f50112c = false;
            if (Math.abs(motionEvent.getX() - this.f50115f) > this.f50111b || Math.abs(motionEvent.getY() - this.f50116g) > this.f50111b) {
                this.f50113d = false;
            }
            if (this.f50113d && motionEvent.getEventTime() - this.f50114e <= ViewConfiguration.getLongPressTimeout() && (interfaceC0548a = this.f50110a) != null) {
                interfaceC0548a.b();
            }
            this.f50113d = false;
        } else if (action != 2) {
            if (action == 3) {
                this.f50112c = false;
                this.f50113d = false;
            }
        } else if (Math.abs(motionEvent.getX() - this.f50115f) > this.f50111b || Math.abs(motionEvent.getY() - this.f50116g) > this.f50111b) {
            this.f50113d = false;
        }
        return true;
    }

    public void e() {
        this.f50112c = false;
        this.f50113d = false;
    }

    public void f(InterfaceC0548a interfaceC0548a) {
        this.f50110a = interfaceC0548a;
    }
}

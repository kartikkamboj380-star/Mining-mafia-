package androidx.core.app;

import android.app.Activity;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import android.view.FrameMetrics;
import android.view.Window;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f9133a;

    private static class a extends b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static HandlerThread f9134e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static Handler f9135f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f9136a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        SparseIntArray[] f9137b = new SparseIntArray[9];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ArrayList f9138c = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Window.OnFrameMetricsAvailableListener f9139d = new WindowOnFrameMetricsAvailableListenerC0145a();

        /* JADX INFO: renamed from: androidx.core.app.j$a$a, reason: collision with other inner class name */
        class WindowOnFrameMetricsAvailableListenerC0145a implements Window.OnFrameMetricsAvailableListener {
            WindowOnFrameMetricsAvailableListenerC0145a() {
            }

            @Override // android.view.Window.OnFrameMetricsAvailableListener
            public void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i10) {
                a aVar = a.this;
                if ((aVar.f9136a & 1) != 0) {
                    aVar.e(aVar.f9137b[0], frameMetrics.getMetric(8));
                }
                a aVar2 = a.this;
                if ((aVar2.f9136a & 2) != 0) {
                    aVar2.e(aVar2.f9137b[1], frameMetrics.getMetric(1));
                }
                a aVar3 = a.this;
                if ((aVar3.f9136a & 4) != 0) {
                    aVar3.e(aVar3.f9137b[2], frameMetrics.getMetric(3));
                }
                a aVar4 = a.this;
                if ((aVar4.f9136a & 8) != 0) {
                    aVar4.e(aVar4.f9137b[3], frameMetrics.getMetric(4));
                }
                a aVar5 = a.this;
                if ((aVar5.f9136a & 16) != 0) {
                    aVar5.e(aVar5.f9137b[4], frameMetrics.getMetric(5));
                }
                a aVar6 = a.this;
                if ((aVar6.f9136a & 64) != 0) {
                    aVar6.e(aVar6.f9137b[6], frameMetrics.getMetric(7));
                }
                a aVar7 = a.this;
                if ((aVar7.f9136a & 32) != 0) {
                    aVar7.e(aVar7.f9137b[5], frameMetrics.getMetric(6));
                }
                a aVar8 = a.this;
                if ((aVar8.f9136a & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0) {
                    aVar8.e(aVar8.f9137b[7], frameMetrics.getMetric(0));
                }
                a aVar9 = a.this;
                if ((aVar9.f9136a & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0) {
                    aVar9.e(aVar9.f9137b[8], frameMetrics.getMetric(2));
                }
            }
        }

        a(int i10) {
            this.f9136a = i10;
        }

        @Override // androidx.core.app.j.b
        public void a(Activity activity) {
            if (f9134e == null) {
                HandlerThread handlerThread = new HandlerThread("FrameMetricsAggregator");
                f9134e = handlerThread;
                handlerThread.start();
                f9135f = new Handler(f9134e.getLooper());
            }
            for (int i10 = 0; i10 <= 8; i10++) {
                SparseIntArray[] sparseIntArrayArr = this.f9137b;
                if (sparseIntArrayArr[i10] == null && (this.f9136a & (1 << i10)) != 0) {
                    sparseIntArrayArr[i10] = new SparseIntArray();
                }
            }
            activity.getWindow().addOnFrameMetricsAvailableListener(this.f9139d, f9135f);
            this.f9138c.add(new WeakReference(activity));
        }

        @Override // androidx.core.app.j.b
        public SparseIntArray[] b() {
            return this.f9137b;
        }

        @Override // androidx.core.app.j.b
        public SparseIntArray[] c(Activity activity) {
            ArrayList arrayList = this.f9138c;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                WeakReference weakReference = (WeakReference) obj;
                if (weakReference.get() == activity) {
                    this.f9138c.remove(weakReference);
                    break;
                }
            }
            activity.getWindow().removeOnFrameMetricsAvailableListener(this.f9139d);
            return this.f9137b;
        }

        @Override // androidx.core.app.j.b
        public SparseIntArray[] d() {
            SparseIntArray[] sparseIntArrayArr = this.f9137b;
            this.f9137b = new SparseIntArray[9];
            return sparseIntArrayArr;
        }

        void e(SparseIntArray sparseIntArray, long j10) {
            if (sparseIntArray != null) {
                int i10 = (int) ((500000 + j10) / 1000000);
                if (j10 >= 0) {
                    sparseIntArray.put(i10, sparseIntArray.get(i10) + 1);
                }
            }
        }
    }

    private static class b {
        b() {
        }

        public abstract void a(Activity activity);

        public abstract SparseIntArray[] b();

        public abstract SparseIntArray[] c(Activity activity);

        public abstract SparseIntArray[] d();
    }

    public j() {
        this(1);
    }

    public void a(Activity activity) {
        this.f9133a.a(activity);
    }

    public SparseIntArray[] b() {
        return this.f9133a.b();
    }

    public SparseIntArray[] c(Activity activity) {
        return this.f9133a.c(activity);
    }

    public SparseIntArray[] d() {
        return this.f9133a.d();
    }

    public j(int i10) {
        this.f9133a = new a(i10);
    }
}

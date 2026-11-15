package p154p3;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.RetryableMountingLayerException;
import com.facebook.react.bridge.SoftAssertions;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.fabric.events.EventEmitterWrapper;
import com.facebook.react.fabric.mounting.mountitems.MountItem;
import com.facebook.react.uimanager.C1385u0;
import com.facebook.react.uimanager.D0;
import com.facebook.react.uimanager.E0;
import com.facebook.react.uimanager.InterfaceC1374o0;
import com.facebook.react.uimanager.InterfaceC1378q0;
import com.facebook.react.uimanager.InterfaceC1395z0;
import com.facebook.react.uimanager.N;
import com.facebook.react.uimanager.P;
import com.facebook.react.uimanager.RootViewManager;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.uimanager.c1;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import p190t.l;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f47815o = "e";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final boolean f47816p;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private E0 f47819c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private N3.a f47822f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private c1 f47823g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private RootViewManager f47824h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private p3.c.b f47825i;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private l f47829m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f47830n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile boolean f47817a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile boolean f47818b = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ConcurrentHashMap f47820d = new ConcurrentHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Queue f47821e = new ArrayDeque();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Set f47826j = new HashSet();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Set f47827k = new HashSet();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Set f47828l = new HashSet();

    class a extends GuardedRunnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f47831a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ReactContext reactContext, View view) {
            super(reactContext);
            this.f47831a = view;
        }

        @Override // com.facebook.react.bridge.GuardedRunnable
        public void runGuarded() {
            if (e.this.w()) {
                return;
            }
            if (this.f47831a.getId() == e.this.f47830n) {
                ReactSoftExceptionLogger.logSoftException(e.f47815o, new P("Race condition in addRootView detected. Trying to set an id of [" + e.this.f47830n + "] on the RootView, but that id has already been set. "));
            } else if (this.f47831a.getId() != -1) {
                String str = e.f47815o;
                Z1.a.o(str, "Trying to add RootTag to RootView that already has a tag: existing tag: [%d] new tag: [%d]", Integer.valueOf(this.f47831a.getId()), Integer.valueOf(e.this.f47830n));
                ReactSoftExceptionLogger.logSoftException(str, new P("Trying to add a root view with an explicit id already set. React Native uses the id field to track react tags and will overwrite this field. If that is fine, explicitly overwrite the id field to View.NO_ID before calling addRootView."));
            }
            this.f47831a.setId(e.this.f47830n);
            KeyEvent.Callback callback = this.f47831a;
            if (callback instanceof InterfaceC1378q0) {
                ((InterfaceC1378q0) callback).setRootViewTag(e.this.f47830n);
            }
            e.this.m();
            e.this.f47818b = true;
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f47833a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f47834b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f47835c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ViewGroup f47836d;

        b(int i10, int i11, int i12, ViewGroup viewGroup) {
            this.f47833a = i10;
            this.f47834b = i11;
            this.f47835c = i12;
            this.f47836d = viewGroup;
        }

        @Override // java.lang.Runnable
        public void run() {
            Z1.a.m(e.f47815o, "addViewAt: [" + this.f47833a + "] -> [" + this.f47834b + "] idx: " + this.f47835c + " AFTER");
            e.y(this.f47836d, false);
        }
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f47838a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f47839b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f47840c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ViewGroup f47841d;

        c(int i10, int i11, int i12, ViewGroup viewGroup) {
            this.f47838a = i10;
            this.f47839b = i11;
            this.f47840c = i12;
            this.f47841d = viewGroup;
        }

        @Override // java.lang.Runnable
        public void run() {
            Z1.a.m(e.f47815o, "removeViewAt: [" + this.f47838a + "] -> [" + this.f47839b + "] idx: " + this.f47840c + " AFTER");
            e.y(this.f47841d, false);
        }
    }

    class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f47843a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ C0516e f47844b;

        d(f fVar, C0516e c0516e) {
            this.f47843a = fVar;
            this.f47844b = c0516e;
        }

        @Override // java.lang.Runnable
        public void run() {
            f fVar = this.f47843a;
            EventEmitterWrapper eventEmitterWrapper = fVar.f47857h;
            if (eventEmitterWrapper != null) {
                this.f47844b.a(eventEmitterWrapper);
                return;
            }
            if (fVar.f47858i == null) {
                fVar.f47858i = new LinkedList();
            }
            this.f47843a.f47858i.add(this.f47844b);
        }
    }

    /* JADX INFO: renamed from: p3.e$e, reason: collision with other inner class name */
    private static class C0516e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f47846a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f47847b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f47848c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final WritableMap f47849d;

        public C0516e(String str, WritableMap writableMap, int i10, boolean z9) {
            this.f47846a = str;
            this.f47849d = writableMap;
            this.f47848c = i10;
            this.f47847b = z9;
        }

        public void a(EventEmitterWrapper eventEmitterWrapper) {
            if (this.f47847b) {
                eventEmitterWrapper.dispatchUnique(this.f47846a, this.f47849d);
            } else {
                eventEmitterWrapper.dispatch(this.f47846a, this.f47849d, this.f47848c);
            }
        }
    }

    static {
        p084i3.a aVar = p084i3.a.f45065a;
        f47816p = false;
    }

    public e(int i10, N3.a aVar, c1 c1Var, RootViewManager rootViewManager, p3.c.b bVar, E0 e10) {
        this.f47830n = i10;
        this.f47822f = aVar;
        this.f47823g = c1Var;
        this.f47824h = rootViewManager;
        this.f47825i = bVar;
        this.f47819c = e10;
    }

    private void A(f fVar) {
        D0 d10 = fVar.f47856g;
        if (d10 != null) {
            d10.destroyState();
            fVar.f47856g = null;
        }
        EventEmitterWrapper eventEmitterWrapper = fVar.f47857h;
        if (eventEmitterWrapper != null) {
            eventEmitterWrapper.destroy();
            fVar.f47857h = null;
        }
        ViewManager viewManager = fVar.f47853d;
        if (fVar.f47852c || viewManager == null) {
            return;
        }
        viewManager.onDropViewInstance(fVar.f47850a);
    }

    private void f(View view) {
        if (w()) {
            return;
        }
        this.f47820d.put(Integer.valueOf(this.f47830n), new f(this.f47830n, view, this.f47824h, true));
        a aVar = new a((ReactContext) p004a3.a.c(this.f47819c), view);
        if (UiThreadUtil.isOnUiThread()) {
            aVar.run();
        } else {
            UiThreadUtil.runOnUiThread(aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        this.f47825i.a(this.f47821e);
    }

    private f p(int i10) {
        ConcurrentHashMap concurrentHashMap = this.f47820d;
        if (concurrentHashMap == null) {
            return null;
        }
        return (f) concurrentHashMap.get(Integer.valueOf(i10));
    }

    private static N t(f fVar) {
        NativeModule nativeModule = fVar.f47853d;
        if (nativeModule != null) {
            return (N) nativeModule;
        }
        throw new IllegalStateException("Unable to find ViewManager for view: " + fVar);
    }

    private f u(int i10) {
        f fVar = (f) this.f47820d.get(Integer.valueOf(i10));
        if (fVar != null) {
            return fVar;
        }
        throw new RetryableMountingLayerException("Unable to find viewState for tag " + i10 + ". Surface stopped: " + w());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x() {
        if (p204u3.b.n()) {
            this.f47823g.m(this.f47830n);
        }
        this.f47829m = new l();
        for (Map.Entry entry : this.f47820d.entrySet()) {
            this.f47829m.k(((Integer) entry.getKey()).intValue(), this);
            A((f) entry.getValue());
        }
        this.f47820d = null;
        this.f47822f = null;
        this.f47824h = null;
        this.f47825i = null;
        this.f47819c = null;
        this.f47821e.clear();
        Z1.a.m(f47815o, "Surface [" + this.f47830n + "] was stopped on SurfaceMountingManager.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void y(ViewGroup viewGroup, boolean z9) {
        int id = viewGroup.getId();
        Z1.a.m(f47815o, "  <ViewGroup tag=" + id + " class=" + viewGroup.getClass().toString() + ">");
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            Z1.a.m(f47815o, "     <View idx=" + i10 + " tag=" + viewGroup.getChildAt(i10).getId() + " class=" + viewGroup.getChildAt(i10).getClass().toString() + ">");
        }
        String str = f47815o;
        Z1.a.m(str, "  </ViewGroup tag=" + id + ">");
        if (z9) {
            Z1.a.m(str, "Displaying Ancestors:");
            for (ViewParent parent = viewGroup.getParent(); parent != null; parent = parent.getParent()) {
                ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                int id2 = viewGroup2 == null ? -1 : viewGroup2.getId();
                Z1.a.m(f47815o, "<ViewParent tag=" + id2 + " class=" + parent.getClass().toString() + ">");
            }
        }
    }

    public void B(String str, int i10, ReadableMap readableMap, D0 d10, boolean z9) {
        UiThreadUtil.assertOnUiThread();
        if (!w() && p(i10) == null) {
            j(str, i10, readableMap, d10, null, z9);
        }
    }

    public void C() {
        Z1.a.o(f47815o, "Views created for surface {%d}:", Integer.valueOf(q()));
        for (f fVar : this.f47820d.values()) {
            ViewManager viewManager = fVar.f47853d;
            Integer numValueOf = null;
            String name = viewManager != null ? viewManager.getName() : null;
            View view = fVar.f47850a;
            View view2 = view != null ? (View) view.getParent() : null;
            if (view2 != null) {
                numValueOf = Integer.valueOf(view2.getId());
            }
            Z1.a.o(f47815o, "<%s id=%d parentTag=%s isRoot=%b />", name, Integer.valueOf(fVar.f47851b), numValueOf, Boolean.valueOf(fVar.f47852c));
        }
    }

    public void D(int i10, int i11, ReadableArray readableArray) {
        if (w()) {
            return;
        }
        f fVarP = p(i10);
        if (fVarP == null) {
            throw new RetryableMountingLayerException("Unable to find viewState for tag: [" + i10 + "] for commandId: " + i11);
        }
        ViewManager viewManager = fVarP.f47853d;
        if (viewManager == null) {
            throw new RetryableMountingLayerException("Unable to find viewManager for tag " + i10);
        }
        View view = fVarP.f47850a;
        if (view != null) {
            viewManager.receiveCommand(view, i11, readableArray);
            return;
        }
        throw new RetryableMountingLayerException("Unable to find viewState view for tag " + i10);
    }

    public void E(int i10, String str, ReadableArray readableArray) {
        if (w()) {
            return;
        }
        f fVarP = p(i10);
        if (fVarP == null) {
            throw new RetryableMountingLayerException("Unable to find viewState for tag: " + i10 + " for commandId: " + str);
        }
        ViewManager viewManager = fVarP.f47853d;
        if (viewManager == null) {
            throw new RetryableMountingLayerException("Unable to find viewState manager for tag " + i10);
        }
        View view = fVarP.f47850a;
        if (view != null) {
            viewManager.receiveCommand(view, str, readableArray);
            return;
        }
        throw new RetryableMountingLayerException("Unable to find viewState view for tag " + i10);
    }

    public void F(int i10, int i11, int i12) {
        int i13;
        if (w()) {
            return;
        }
        if (this.f47826j.contains(Integer.valueOf(i10))) {
            ReactSoftExceptionLogger.logSoftException(f47815o, new P("removeViewAt tried to remove a React View that was actually reused. This indicates a bug in the Differ (specifically instruction ordering). [" + i10 + "]"));
            return;
        }
        UiThreadUtil.assertOnUiThread();
        f fVarP = p(i11);
        if (fVarP == null) {
            ReactSoftExceptionLogger.logSoftException(ReactSoftExceptionLogger.Categories.SURFACE_MOUNTING_MANAGER_MISSING_VIEWSTATE, new IllegalStateException("Unable to find viewState for tag: [" + i11 + "] for removeViewAt"));
            return;
        }
        View view = fVarP.f47850a;
        if (!(view instanceof ViewGroup)) {
            String str = "Unable to remove a view from a view that is not a ViewGroup. ParentTag: " + i11 + " - Tag: " + i10 + " - Index: " + i12;
            Z1.a.m(f47815o, str);
            throw new IllegalStateException(str);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup == null) {
            throw new IllegalStateException("Unable to find view for tag [" + i11 + "]");
        }
        int i14 = 0;
        if (f47816p) {
            Z1.a.m(f47815o, "removeViewAt: [" + i10 + "] -> [" + i11 + "] idx: " + i12 + " BEFORE");
            y(viewGroup, false);
        }
        N nT = t(fVarP);
        View childAt = nT.getChildAt(viewGroup, i12);
        int id = childAt != null ? childAt.getId() : -1;
        if (id != i10) {
            int childCount = viewGroup.getChildCount();
            while (true) {
                if (i14 >= childCount) {
                    i14 = -1;
                    break;
                } else if (viewGroup.getChildAt(i14).getId() == i10) {
                    break;
                } else {
                    i14++;
                }
            }
            if (i14 == -1) {
                Z1.a.m(f47815o, "removeViewAt: [" + i10 + "] -> [" + i11 + "] @" + i12 + ": view already removed from parent! Children in parent: " + childCount);
                return;
            }
            y(viewGroup, true);
            ReactSoftExceptionLogger.logSoftException(f47815o, new IllegalStateException("Tried to remove view [" + i10 + "] of parent [" + i11 + "] at index " + i12 + ", but got view tag " + id + " - actual index of view: " + i14));
            i13 = i14;
        } else {
            i13 = i12;
        }
        try {
            nT.removeViewAt(viewGroup, i13);
            if (f47816p) {
                UiThreadUtil.runOnUiThread(new c(i10, i11, i13, viewGroup));
            }
        } catch (RuntimeException e10) {
            int childCount2 = nT.getChildCount(viewGroup);
            y(viewGroup, true);
            throw new IllegalStateException("Cannot remove child at index " + i13 + " from parent ViewGroup [" + viewGroup.getId() + "], only " + childCount2 + " children in parent. Warning: childCount may be incorrect!", e10);
        }
    }

    public void G(MountItem mountItem) {
        this.f47821e.add(mountItem);
    }

    public void H(int i10, int i11) {
        if (w()) {
            return;
        }
        f fVarU = u(i10);
        if (fVarU.f47853d == null) {
            throw new RetryableMountingLayerException("Unable to find viewState manager for tag " + i10);
        }
        View view = fVarU.f47850a;
        if (view != null) {
            view.sendAccessibilityEvent(i11);
            return;
        }
        throw new RetryableMountingLayerException("Unable to find viewState view for tag " + i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public synchronized void I(int i10, int i11, boolean z9) {
        UiThreadUtil.assertOnUiThread();
        if (w()) {
            return;
        }
        if (!z9) {
            this.f47822f.d(i11, null);
            return;
        }
        f fVarU = u(i10);
        View view = fVarU.f47850a;
        if (i11 != i10 && (view instanceof ViewParent)) {
            this.f47822f.d(i11, (ViewParent) view);
            return;
        }
        if (view == 0) {
            SoftAssertions.assertUnreachable("Cannot find view for tag [" + i10 + "].");
            return;
        }
        if (fVarU.f47852c) {
            SoftAssertions.assertUnreachable("Cannot block native responder on [" + i10 + "] that is a root view");
        }
        this.f47822f.d(i11, view.getParent());
    }

    public void J() {
        Z1.a.m(f47815o, "Stopping surface [" + this.f47830n + "]");
        if (w()) {
            return;
        }
        this.f47817a = true;
        for (f fVar : this.f47820d.values()) {
            D0 d10 = fVar.f47856g;
            if (d10 != null) {
                d10.destroyState();
                fVar.f47856g = null;
            }
            EventEmitterWrapper eventEmitterWrapper = fVar.f47857h;
            if (eventEmitterWrapper != null) {
                eventEmitterWrapper.destroy();
                fVar.f47857h = null;
            }
        }
        Runnable runnable = new Runnable() { // from class: p3.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f47814a.x();
            }
        };
        if (UiThreadUtil.isOnUiThread()) {
            runnable.run();
        } else {
            UiThreadUtil.runOnUiThread(runnable);
        }
    }

    public void K(int i10) {
        this.f47827k.remove(Integer.valueOf(i10));
        if (this.f47828l.contains(Integer.valueOf(i10))) {
            this.f47828l.remove(Integer.valueOf(i10));
            k(i10);
        }
    }

    public void L(int i10, EventEmitterWrapper eventEmitterWrapper) {
        UiThreadUtil.assertOnUiThread();
        if (w()) {
            return;
        }
        f fVar = (f) this.f47820d.get(Integer.valueOf(i10));
        if (fVar == null) {
            fVar = new f(i10);
            this.f47820d.put(Integer.valueOf(i10), fVar);
        }
        EventEmitterWrapper eventEmitterWrapper2 = fVar.f47857h;
        fVar.f47857h = eventEmitterWrapper;
        if (eventEmitterWrapper2 != eventEmitterWrapper && eventEmitterWrapper2 != null) {
            eventEmitterWrapper2.destroy();
        }
        Queue queue = fVar.f47858i;
        if (queue != null) {
            Iterator it = queue.iterator();
            while (it.hasNext()) {
                ((C0516e) it.next()).a(eventEmitterWrapper);
            }
            fVar.f47858i = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0073  */
    /* JADX WARN: Code duplicated, block: B:32:0x007a  */
    /* JADX WARN: Code duplicated, block: B:35:0x0081  */
    /* JADX WARN: Code duplicated, block: B:39:? A[RETURN, SYNTHETIC] */
    public void M(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        N n10;
        int i18;
        if (w()) {
            return;
        }
        f fVarU = u(i10);
        if (fVarU.f47852c) {
            return;
        }
        View view = fVarU.f47850a;
        if (view == null) {
            throw new IllegalStateException("Unable to find View for tag: " + i10);
        }
        int i19 = 1;
        if (i17 == 1) {
            i19 = 0;
        } else if (i17 != 2) {
            i19 = 2;
        }
        view.setLayoutDirection(i19);
        view.measure(View.MeasureSpec.makeMeasureSpec(i14, 1073741824), View.MeasureSpec.makeMeasureSpec(i15, 1073741824));
        ViewParent parent = view.getParent();
        if (parent instanceof InterfaceC1395z0) {
            parent.requestLayout();
        }
        f fVarP = p(i11);
        if (fVarP != null) {
            NativeModule nativeModule = fVarP.f47853d;
            n10 = nativeModule != null ? (N) nativeModule : null;
            if (n10 != null || !n10.needsCustomLayoutForChildren()) {
                view.layout(i12, i13, i14 + i12, i15 + i13);
            }
            i18 = i16 == 0 ? 4 : 0;
            if (view.getVisibility() != i18) {
                view.setVisibility(i18);
            }
        }
        ReactSoftExceptionLogger.logSoftException(ReactSoftExceptionLogger.Categories.SURFACE_MOUNTING_MANAGER_MISSING_VIEWSTATE, new ReactNoCrashSoftException("Unable to find viewState for tag: " + i11 + " for updateLayout"));
        if (n10 != null) {
            view.layout(i12, i13, i14 + i12, i15 + i13);
        } else {
            view.layout(i12, i13, i14 + i12, i15 + i13);
        }
        if (i16 == 0) {
        }
        if (view.getVisibility() != i18) {
            view.setVisibility(i18);
        }
    }

    public void N(int i10, int i11, int i12, int i13, int i14) {
        if (w()) {
            return;
        }
        f fVarU = u(i10);
        if (fVarU.f47852c) {
            return;
        }
        KeyEvent.Callback callback = fVarU.f47850a;
        if (callback != null) {
            if (callback instanceof InterfaceC1374o0) {
                ((InterfaceC1374o0) callback).setOverflowInset(i11, i12, i13, i14);
            }
        } else {
            throw new IllegalStateException("Unable to find View for tag: " + i10);
        }
    }

    public void O(int i10, int i11, int i12, int i13, int i14) {
        UiThreadUtil.assertOnUiThread();
        if (w()) {
            return;
        }
        f fVarU = u(i10);
        if (fVarU.f47852c) {
            return;
        }
        View view = fVarU.f47850a;
        if (view == null) {
            throw new IllegalStateException("Unable to find View for tag: " + i10);
        }
        ViewManager viewManager = fVarU.f47853d;
        if (viewManager != null) {
            viewManager.setPadding(view, i11, i12, i13, i14);
            return;
        }
        throw new IllegalStateException("Unable to find ViewManager for view: " + fVarU);
    }

    public void P(int i10, ReadableMap readableMap) {
        if (w()) {
            return;
        }
        f fVarU = u(i10);
        fVarU.f47854e = new C1385u0(readableMap);
        View view = fVarU.f47850a;
        if (view != null) {
            ((ViewManager) p004a3.a.c(fVarU.f47853d)).updateProperties(view, fVarU.f47854e);
            return;
        }
        throw new IllegalStateException("Unable to find view for tag [" + i10 + "]");
    }

    public void Q(int i10, D0 d10) {
        UiThreadUtil.assertOnUiThread();
        if (w()) {
            return;
        }
        f fVarU = u(i10);
        D0 d11 = fVarU.f47856g;
        fVarU.f47856g = d10;
        ViewManager viewManager = fVarU.f47853d;
        if (viewManager == null) {
            throw new IllegalStateException("Unable to find ViewManager for tag: " + i10);
        }
        Object objUpdateState = viewManager.updateState(fVarU.f47850a, fVarU.f47854e, d10);
        if (objUpdateState != null) {
            viewManager.updateExtraData(fVarU.f47850a, objUpdateState);
        }
        if (d11 != null) {
            d11.destroyState();
        }
    }

    public void g(int i10, int i11, int i12) {
        UiThreadUtil.assertOnUiThread();
        if (w()) {
            return;
        }
        f fVarU = u(i10);
        View view = fVarU.f47850a;
        if (!(view instanceof ViewGroup)) {
            String str = "Unable to add a view into a view that is not a ViewGroup. ParentTag: " + i10 + " - Tag: " + i11 + " - Index: " + i12;
            Z1.a.m(f47815o, str);
            throw new IllegalStateException(str);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        f fVarU2 = u(i11);
        View view2 = fVarU2.f47850a;
        if (view2 == null) {
            throw new IllegalStateException("Unable to find view for viewState " + fVarU2 + " and tag " + i11);
        }
        boolean z9 = f47816p;
        if (z9) {
            Z1.a.m(f47815o, "addViewAt: [" + i11 + "] -> [" + i10 + "] idx: " + i12 + " BEFORE");
            y(viewGroup, false);
        }
        ViewParent parent = view2.getParent();
        if (parent != null) {
            boolean z10 = parent instanceof ViewGroup;
            int id = z10 ? ((ViewGroup) parent).getId() : -1;
            ReactSoftExceptionLogger.logSoftException(f47815o, new IllegalStateException("addViewAt: cannot insert view [" + i11 + "] into parent [" + i10 + "]: View already has a parent: [" + id + "]  Parent: " + parent.getClass().getSimpleName() + " View: " + view2.getClass().getSimpleName()));
            if (z10) {
                ((ViewGroup) parent).removeView(view2);
            }
            this.f47826j.add(Integer.valueOf(i11));
        }
        try {
            t(fVarU).addView(viewGroup, view2, i12);
            if (z9) {
                UiThreadUtil.runOnUiThread(new b(i11, i10, i12, viewGroup));
            }
        } catch (IllegalStateException | IndexOutOfBoundsException e10) {
            throw new IllegalStateException("addViewAt: failed to insert view [" + i11 + "] into parent [" + i10 + "] at index " + i12, e10);
        }
    }

    public void h(View view, E0 e10) {
        this.f47819c = e10;
        f(view);
    }

    public void i(String str, int i10, ReadableMap readableMap, D0 d10, EventEmitterWrapper eventEmitterWrapper, boolean z9) {
        if (w()) {
            return;
        }
        f fVarP = p(i10);
        if (fVarP == null || fVarP.f47850a == null) {
            j(str, i10, readableMap, d10, eventEmitterWrapper, z9);
        }
    }

    public void j(String str, int i10, ReadableMap readableMap, D0 d10, EventEmitterWrapper eventEmitterWrapper, boolean z9) {
        p065g4.a.c(0L, "SurfaceMountingManager::createViewUnsafe(" + str + ")");
        try {
            C1385u0 c1385u0 = new C1385u0(readableMap);
            f fVar = new f(i10);
            fVar.f47854e = c1385u0;
            fVar.f47856g = d10;
            fVar.f47857h = eventEmitterWrapper;
            this.f47820d.put(Integer.valueOf(i10), fVar);
            if (z9) {
                ViewManager viewManagerG = this.f47823g.g(str);
                fVar.f47850a = viewManagerG.createView(i10, this.f47819c, c1385u0, d10, this.f47822f);
                fVar.f47853d = viewManagerG;
            }
        } finally {
            p065g4.a.i(0L);
        }
    }

    public void k(int i10) {
        UiThreadUtil.assertOnUiThread();
        if (w()) {
            return;
        }
        f fVarP = p(i10);
        if (fVarP == null) {
            ReactSoftExceptionLogger.logSoftException(ReactSoftExceptionLogger.Categories.SURFACE_MOUNTING_MANAGER_MISSING_VIEWSTATE, new ReactNoCrashSoftException("Unable to find viewState for tag: " + i10 + " for deleteView"));
            return;
        }
        if (this.f47827k.contains(Integer.valueOf(i10))) {
            this.f47828l.add(Integer.valueOf(i10));
        } else {
            this.f47820d.remove(Integer.valueOf(i10));
            A(fVarP);
        }
    }

    public void l(int i10, String str, boolean z9, WritableMap writableMap, int i11) {
        f fVar;
        ConcurrentHashMap concurrentHashMap = this.f47820d;
        if (concurrentHashMap == null || (fVar = (f) concurrentHashMap.get(Integer.valueOf(i10))) == null) {
            return;
        }
        UiThreadUtil.runOnUiThread(new d(fVar, new C0516e(str, writableMap, i11, z9)));
    }

    public E0 n() {
        return this.f47819c;
    }

    public EventEmitterWrapper o(int i10) {
        f fVarP = p(i10);
        if (fVarP == null) {
            return null;
        }
        return fVarP.f47857h;
    }

    public int q() {
        return this.f47830n;
    }

    public View r(int i10) {
        f fVarP = p(i10);
        View view = fVarP == null ? null : fVarP.f47850a;
        if (view != null) {
            return view;
        }
        throw new P("Trying to resolve view with tag " + i10 + " which doesn't exist");
    }

    public boolean s(int i10) {
        l lVar = this.f47829m;
        if (lVar != null && lVar.e(i10)) {
            return true;
        }
        ConcurrentHashMap concurrentHashMap = this.f47820d;
        if (concurrentHashMap == null) {
            return false;
        }
        return concurrentHashMap.containsKey(Integer.valueOf(i10));
    }

    public boolean v() {
        return this.f47818b;
    }

    public boolean w() {
        return this.f47817a;
    }

    public void z(int i10) {
        this.f47827k.add(Integer.valueOf(i10));
    }

    private static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        View f47850a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f47851b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final boolean f47852c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        ViewManager f47853d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        C1385u0 f47854e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        ReadableMap f47855f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        D0 f47856g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        EventEmitterWrapper f47857h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        Queue f47858i;

        public String toString() {
            return "ViewState [" + this.f47851b + "] - isRoot: " + this.f47852c + " - props: " + this.f47854e + " - localData: " + this.f47855f + " - viewManager: " + this.f47853d + " - isLayoutOnly: " + (this.f47853d == null);
        }

        private f(int i10) {
            this(i10, null, null, false);
        }

        private f(int i10, View view, ViewManager viewManager, boolean z9) {
            this.f47854e = null;
            this.f47855f = null;
            this.f47856g = null;
            this.f47857h = null;
            this.f47858i = null;
            this.f47851b = i10;
            this.f47850a = view;
            this.f47852c = z9;
            this.f47853d = viewManager;
        }
    }
}

package androidx.fragment.app;

import O.AbstractC0879u;
import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.annotation.NonNull;
import androidx.lifecycle.AbstractC1164j;
import androidx.lifecycle.AbstractC1177x;
import androidx.lifecycle.C1173t;
import androidx.lifecycle.InterfaceC1162h;
import androidx.lifecycle.InterfaceC1168n;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: androidx.fragment.app.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class ComponentCallbacksC1144o implements ComponentCallbacks, View.OnCreateContextMenuListener, androidx.lifecycle.r, androidx.lifecycle.W, InterfaceC1162h, p251z0.f {
    static final int ACTIVITY_CREATED = 4;
    static final int ATTACHED = 0;
    static final int AWAITING_ENTER_EFFECTS = 6;
    static final int AWAITING_EXIT_EFFECTS = 3;
    static final int CREATED = 1;
    static final int INITIALIZING = -1;
    static final int RESUMED = 7;
    static final int STARTED = 5;
    static final Object USE_DEFAULT_TRANSITION = new Object();
    static final int VIEW_CREATED = 2;
    boolean mAdded;
    k mAnimationInfo;
    Bundle mArguments;
    int mBackStackNesting;
    boolean mBeingSaved;
    private boolean mCalled;
    ViewGroup mContainer;
    int mContainerId;
    private int mContentLayoutId;
    androidx.lifecycle.U.c mDefaultFactory;
    boolean mDeferStart;
    boolean mDetached;
    int mFragmentId;
    G mFragmentManager;
    boolean mFromLayout;
    boolean mHasMenu;
    boolean mHidden;
    boolean mHiddenChanged;
    AbstractC1153y mHost;
    boolean mInLayout;
    boolean mIsCreated;
    LayoutInflater mLayoutInflater;
    C1173t mLifecycleRegistry;
    ComponentCallbacksC1144o mParentFragment;
    boolean mPerformedCreateView;
    Handler mPostponedHandler;
    public String mPreviousWho;
    boolean mRemoving;
    boolean mRestored;
    boolean mRetainInstance;
    boolean mRetainInstanceChangedWhileDetached;
    Bundle mSavedFragmentState;
    p251z0.e mSavedStateRegistryController;
    Boolean mSavedUserVisibleHint;
    Bundle mSavedViewRegistryState;
    SparseArray<Parcelable> mSavedViewState;
    String mTag;
    ComponentCallbacksC1144o mTarget;
    int mTargetRequestCode;
    View mView;
    T mViewLifecycleOwner;
    int mState = -1;

    @NonNull
    String mWho = UUID.randomUUID().toString();
    String mTargetWho = null;
    private Boolean mIsPrimaryNavigationFragment = null;

    @NonNull
    G mChildFragmentManager = new H();
    boolean mMenuVisible = true;
    boolean mUserVisibleHint = true;
    Runnable mPostponedDurationRunnable = new b();
    AbstractC1164j.b mMaxState = AbstractC1164j.b.RESUMED;
    androidx.lifecycle.z mViewLifecycleOwnerLiveData = new androidx.lifecycle.z();
    private final AtomicInteger mNextLocalRequestCode = new AtomicInteger();
    private final ArrayList<n> mOnPreAttachedListeners = new ArrayList<>();
    private final n mSavedStateAttachListener = new c();

    /* JADX INFO: renamed from: androidx.fragment.app.o$a */
    class a extends p040e.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AtomicReference f10071a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p050f.a f10072b;

        a(AtomicReference atomicReference, p050f.a aVar) {
            this.f10071a = atomicReference;
            this.f10072b = aVar;
        }

        @Override // p040e.c
        public void b(Object obj, androidx.core.app.c cVar) {
            p040e.c cVar2 = (p040e.c) this.f10071a.get();
            if (cVar2 == null) {
                throw new IllegalStateException("Operation cannot be started before fragment is in created state");
            }
            cVar2.b(obj, cVar);
        }

        @Override // p040e.c
        public void c() {
            p040e.c cVar = (p040e.c) this.f10071a.getAndSet(null);
            if (cVar != null) {
                cVar.c();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.o$b */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ComponentCallbacksC1144o.this.startPostponedEnterTransition();
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.o$c */
    class c extends n {
        c() {
            super(null);
        }

        @Override // androidx.fragment.app.ComponentCallbacksC1144o.n
        void a() {
            ComponentCallbacksC1144o.this.mSavedStateRegistryController.c();
            androidx.lifecycle.L.c(ComponentCallbacksC1144o.this);
            Bundle bundle = ComponentCallbacksC1144o.this.mSavedFragmentState;
            ComponentCallbacksC1144o.this.mSavedStateRegistryController.d(bundle != null ? bundle.getBundle("registryState") : null);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.o$d */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ComponentCallbacksC1144o.this.callStartTransitionListener(false);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.o$e */
    class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ X f10077a;

        e(X x10) {
            this.f10077a = x10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f10077a.k();
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.o$f */
    class f extends AbstractC1150v {
        f() {
        }

        @Override // androidx.fragment.app.AbstractC1150v
        public View c(int i10) {
            View view = ComponentCallbacksC1144o.this.mView;
            if (view != null) {
                return view.findViewById(i10);
            }
            throw new IllegalStateException("Fragment " + ComponentCallbacksC1144o.this + " does not have a view");
        }

        @Override // androidx.fragment.app.AbstractC1150v
        public boolean d() {
            return ComponentCallbacksC1144o.this.mView != null;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.o$g */
    class g implements InterfaceC1168n {
        g() {
        }

        @Override // androidx.lifecycle.InterfaceC1168n
        public void onStateChanged(androidx.lifecycle.r rVar, AbstractC1164j.a aVar) {
            View view;
            if (aVar != AbstractC1164j.a.ON_STOP || (view = ComponentCallbacksC1144o.this.mView) == null) {
                return;
            }
            l.a(view);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.o$h */
    class h implements p160q.a {
        h() {
        }

        @Override // p160q.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public p040e.e apply(Void r10) {
            ComponentCallbacksC1144o componentCallbacksC1144o = ComponentCallbacksC1144o.this;
            Object obj = componentCallbacksC1144o.mHost;
            return obj instanceof p040e.f ? ((p040e.f) obj).getActivityResultRegistry() : componentCallbacksC1144o.requireActivity().getActivityResultRegistry();
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.o$i */
    class i implements p160q.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p040e.e f10082a;

        i(p040e.e eVar) {
            this.f10082a = eVar;
        }

        @Override // p160q.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public p040e.e apply(Void r10) {
            return this.f10082a;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.o$j */
    class j extends n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p160q.a f10084a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AtomicReference f10085b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p050f.a f10086c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ p040e.b f10087d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(p160q.a aVar, AtomicReference atomicReference, p050f.a aVar2, p040e.b bVar) {
            super(null);
            this.f10084a = aVar;
            this.f10085b = atomicReference;
            this.f10086c = aVar2;
            this.f10087d = bVar;
        }

        @Override // androidx.fragment.app.ComponentCallbacksC1144o.n
        void a() {
            String strGenerateActivityResultKey = ComponentCallbacksC1144o.this.generateActivityResultKey();
            this.f10085b.set(((p040e.e) this.f10084a.apply(null)).l(strGenerateActivityResultKey, ComponentCallbacksC1144o.this, this.f10086c, this.f10087d));
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.o$k */
    static class k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        View f10089a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f10090b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f10091c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f10092d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f10093e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f10094f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f10095g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        ArrayList f10096h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        ArrayList f10097i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f10098j = null;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f10099k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f10100l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f10101m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f10102n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f10103o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Boolean f10104p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Boolean f10105q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        float f10106r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        View f10107s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        boolean f10108t;

        k() {
            Object obj = ComponentCallbacksC1144o.USE_DEFAULT_TRANSITION;
            this.f10099k = obj;
            this.f10100l = null;
            this.f10101m = obj;
            this.f10102n = null;
            this.f10103o = obj;
            this.f10106r = 1.0f;
            this.f10107s = null;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.o$l */
    static class l {
        static void a(View view) {
            view.cancelPendingInputEvents();
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.o$m */
    public static class m extends RuntimeException {
        public m(String str, Exception exc) {
            super(str, exc);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.o$n */
    private static abstract class n {
        private n() {
        }

        abstract void a();

        /* synthetic */ n(b bVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.o$o, reason: collision with other inner class name */
    public static class C0157o implements Parcelable {

        @NonNull
        public static final Parcelable.Creator<C0157o> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Bundle f10109a;

        /* JADX INFO: renamed from: androidx.fragment.app.o$o$a */
        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public C0157o createFromParcel(Parcel parcel) {
                return new C0157o(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public C0157o createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0157o(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public C0157o[] newArray(int i10) {
                return new C0157o[i10];
            }
        }

        C0157o(Parcel parcel, ClassLoader classLoader) {
            Bundle bundle = parcel.readBundle();
            this.f10109a = bundle;
            if (classLoader == null || bundle == null) {
                return;
            }
            bundle.setClassLoader(classLoader);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeBundle(this.f10109a);
        }
    }

    public ComponentCallbacksC1144o() {
        p();
    }

    @NonNull
    @Deprecated
    public static ComponentCallbacksC1144o instantiate(@NonNull Context context, @NonNull String str) {
        return instantiate(context, str, null);
    }

    public static /* synthetic */ void l(ComponentCallbacksC1144o componentCallbacksC1144o) {
        componentCallbacksC1144o.mViewLifecycleOwner.d(componentCallbacksC1144o.mSavedViewRegistryState);
        componentCallbacksC1144o.mSavedViewRegistryState = null;
    }

    private k m() {
        if (this.mAnimationInfo == null) {
            this.mAnimationInfo = new k();
        }
        return this.mAnimationInfo;
    }

    private int n() {
        AbstractC1164j.b bVar = this.mMaxState;
        return (bVar == AbstractC1164j.b.INITIALIZED || this.mParentFragment == null) ? bVar.ordinal() : Math.min(bVar.ordinal(), this.mParentFragment.n());
    }

    private ComponentCallbacksC1144o o(boolean z9) {
        String str;
        if (z9) {
            p081i0.c.j(this);
        }
        ComponentCallbacksC1144o componentCallbacksC1144o = this.mTarget;
        if (componentCallbacksC1144o != null) {
            return componentCallbacksC1144o;
        }
        G g10 = this.mFragmentManager;
        if (g10 == null || (str = this.mTargetWho) == null) {
            return null;
        }
        return g10.e0(str);
    }

    private void p() {
        this.mLifecycleRegistry = new C1173t(this);
        this.mSavedStateRegistryController = p251z0.e.a(this);
        this.mDefaultFactory = null;
        if (this.mOnPreAttachedListeners.contains(this.mSavedStateAttachListener)) {
            return;
        }
        r(this.mSavedStateAttachListener);
    }

    private p040e.c q(p050f.a aVar, p160q.a aVar2, p040e.b bVar) {
        if (this.mState <= 1) {
            AtomicReference atomicReference = new AtomicReference();
            r(new j(aVar2, atomicReference, aVar, bVar));
            return new a(atomicReference, aVar);
        }
        throw new IllegalStateException("Fragment " + this + " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate()).");
    }

    private void r(n nVar) {
        if (this.mState >= 0) {
            nVar.a();
        } else {
            this.mOnPreAttachedListeners.add(nVar);
        }
    }

    private void s() {
        if (G.I0(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + this);
        }
        if (this.mView != null) {
            Bundle bundle = this.mSavedFragmentState;
            restoreViewState(bundle != null ? bundle.getBundle("savedInstanceState") : null);
        }
        this.mSavedFragmentState = null;
    }

    void callStartTransitionListener(boolean z9) {
        ViewGroup viewGroup;
        G g10;
        k kVar = this.mAnimationInfo;
        if (kVar != null) {
            kVar.f10108t = false;
        }
        if (this.mView == null || (viewGroup = this.mContainer) == null || (g10 = this.mFragmentManager) == null) {
            return;
        }
        X xR = X.r(viewGroup, g10);
        xR.t();
        if (z9) {
            this.mHost.g().post(new e(xR));
        } else {
            xR.k();
        }
        Handler handler = this.mPostponedHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mPostponedDurationRunnable);
            this.mPostponedHandler = null;
        }
    }

    @NonNull
    AbstractC1150v createFragmentContainer() {
        return new f();
    }

    public void dump(@NonNull String str, FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.mFragmentId));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.mContainerId));
        printWriter.print(" mTag=");
        printWriter.println(this.mTag);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.mState);
        printWriter.print(" mWho=");
        printWriter.print(this.mWho);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.mBackStackNesting);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.mAdded);
        printWriter.print(" mRemoving=");
        printWriter.print(this.mRemoving);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.mFromLayout);
        printWriter.print(" mInLayout=");
        printWriter.println(this.mInLayout);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.mHidden);
        printWriter.print(" mDetached=");
        printWriter.print(this.mDetached);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.mMenuVisible);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.mHasMenu);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.mRetainInstance);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.mUserVisibleHint);
        if (this.mFragmentManager != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.mFragmentManager);
        }
        if (this.mHost != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.mHost);
        }
        if (this.mParentFragment != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.mParentFragment);
        }
        if (this.mArguments != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.mArguments);
        }
        if (this.mSavedFragmentState != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.mSavedFragmentState);
        }
        if (this.mSavedViewState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.mSavedViewState);
        }
        if (this.mSavedViewRegistryState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.mSavedViewRegistryState);
        }
        ComponentCallbacksC1144o componentCallbacksC1144oO = o(false);
        if (componentCallbacksC1144oO != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(componentCallbacksC1144oO);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.mTargetRequestCode);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(getPopDirection());
        if (getEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(getEnterAnim());
        }
        if (getExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(getExitAnim());
        }
        if (getPopEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(getPopEnterAnim());
        }
        if (getPopExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(getPopExitAnim());
        }
        if (this.mContainer != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.mContainer);
        }
        if (this.mView != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.mView);
        }
        if (getAnimatingAway() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(getAnimatingAway());
        }
        if (getContext() != null) {
            androidx.loader.app.a.b(this).a(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.mChildFragmentManager + ":");
        this.mChildFragmentManager.V(str + "  ", fileDescriptor, printWriter, strArr);
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    ComponentCallbacksC1144o findFragmentByWho(@NonNull String str) {
        return str.equals(this.mWho) ? this : this.mChildFragmentManager.j0(str);
    }

    @NonNull
    String generateActivityResultKey() {
        return "fragment_" + this.mWho + "_rq#" + this.mNextLocalRequestCode.getAndIncrement();
    }

    public final AbstractActivityC1148t getActivity() {
        AbstractC1153y abstractC1153y = this.mHost;
        if (abstractC1153y == null) {
            return null;
        }
        return (AbstractActivityC1148t) abstractC1153y.e();
    }

    public boolean getAllowEnterTransitionOverlap() {
        Boolean bool;
        k kVar = this.mAnimationInfo;
        if (kVar == null || (bool = kVar.f10105q) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public boolean getAllowReturnTransitionOverlap() {
        Boolean bool;
        k kVar = this.mAnimationInfo;
        if (kVar == null || (bool = kVar.f10104p) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    View getAnimatingAway() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        return kVar.f10089a;
    }

    public final Bundle getArguments() {
        return this.mArguments;
    }

    @NonNull
    public final G getChildFragmentManager() {
        if (this.mHost != null) {
            return this.mChildFragmentManager;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public Context getContext() {
        AbstractC1153y abstractC1153y = this.mHost;
        if (abstractC1153y == null) {
            return null;
        }
        return abstractC1153y.f();
    }

    @Override // androidx.lifecycle.InterfaceC1162h
    @NonNull
    public p121m0.a getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && G.I0(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + requireContext().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        p121m0.b bVar = new p121m0.b();
        if (application != null) {
            bVar.c(androidx.lifecycle.U.a.f10194h, application);
        }
        bVar.c(androidx.lifecycle.L.f10166a, this);
        bVar.c(androidx.lifecycle.L.f10167b, this);
        if (getArguments() != null) {
            bVar.c(androidx.lifecycle.L.f10168c, getArguments());
        }
        return bVar;
    }

    @NonNull
    public androidx.lifecycle.U.c getDefaultViewModelProviderFactory() {
        Application application;
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.mDefaultFactory == null) {
            Context applicationContext = requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            if (application == null && G.I0(3)) {
                Log.d("FragmentManager", "Could not find Application instance from Context " + requireContext().getApplicationContext() + ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
            }
            this.mDefaultFactory = new androidx.lifecycle.O(application, this, getArguments());
        }
        return this.mDefaultFactory;
    }

    int getEnterAnim() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return 0;
        }
        return kVar.f10091c;
    }

    public Object getEnterTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        return kVar.f10098j;
    }

    androidx.core.app.y getEnterTransitionCallback() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        kVar.getClass();
        return null;
    }

    int getExitAnim() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return 0;
        }
        return kVar.f10092d;
    }

    public Object getExitTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        return kVar.f10100l;
    }

    androidx.core.app.y getExitTransitionCallback() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        kVar.getClass();
        return null;
    }

    View getFocusedView() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        return kVar.f10107s;
    }

    @Deprecated
    public final G getFragmentManager() {
        return this.mFragmentManager;
    }

    public final Object getHost() {
        AbstractC1153y abstractC1153y = this.mHost;
        if (abstractC1153y == null) {
            return null;
        }
        return abstractC1153y.i();
    }

    public final int getId() {
        return this.mFragmentId;
    }

    @NonNull
    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.mLayoutInflater;
        return layoutInflater == null ? performGetLayoutInflater(null) : layoutInflater;
    }

    @Override // androidx.lifecycle.r
    @NonNull
    public AbstractC1164j getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @NonNull
    @Deprecated
    public androidx.loader.app.a getLoaderManager() {
        return androidx.loader.app.a.b(this);
    }

    int getNextTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return 0;
        }
        return kVar.f10095g;
    }

    public final ComponentCallbacksC1144o getParentFragment() {
        return this.mParentFragment;
    }

    @NonNull
    public final G getParentFragmentManager() {
        G g10 = this.mFragmentManager;
        if (g10 != null) {
            return g10;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    boolean getPopDirection() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return false;
        }
        return kVar.f10090b;
    }

    int getPopEnterAnim() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return 0;
        }
        return kVar.f10093e;
    }

    int getPopExitAnim() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return 0;
        }
        return kVar.f10094f;
    }

    float getPostOnViewCreatedAlpha() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return 1.0f;
        }
        return kVar.f10106r;
    }

    public Object getReenterTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        Object obj = kVar.f10101m;
        return obj == USE_DEFAULT_TRANSITION ? getExitTransition() : obj;
    }

    @NonNull
    public final Resources getResources() {
        return requireContext().getResources();
    }

    @Deprecated
    public final boolean getRetainInstance() {
        p081i0.c.h(this);
        return this.mRetainInstance;
    }

    public Object getReturnTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        Object obj = kVar.f10099k;
        return obj == USE_DEFAULT_TRANSITION ? getEnterTransition() : obj;
    }

    @Override // p251z0.f
    @NonNull
    public final p251z0.d getSavedStateRegistry() {
        return this.mSavedStateRegistryController.b();
    }

    public Object getSharedElementEnterTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        return kVar.f10102n;
    }

    public Object getSharedElementReturnTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        Object obj = kVar.f10103o;
        return obj == USE_DEFAULT_TRANSITION ? getSharedElementEnterTransition() : obj;
    }

    @NonNull
    ArrayList<String> getSharedElementSourceNames() {
        ArrayList<String> arrayList;
        k kVar = this.mAnimationInfo;
        return (kVar == null || (arrayList = kVar.f10096h) == null) ? new ArrayList<>() : arrayList;
    }

    @NonNull
    ArrayList<String> getSharedElementTargetNames() {
        ArrayList<String> arrayList;
        k kVar = this.mAnimationInfo;
        return (kVar == null || (arrayList = kVar.f10097i) == null) ? new ArrayList<>() : arrayList;
    }

    @NonNull
    public final String getString(int i10) {
        return getResources().getString(i10);
    }

    public final String getTag() {
        return this.mTag;
    }

    @Deprecated
    public final ComponentCallbacksC1144o getTargetFragment() {
        return o(true);
    }

    @Deprecated
    public final int getTargetRequestCode() {
        p081i0.c.i(this);
        return this.mTargetRequestCode;
    }

    @NonNull
    public final CharSequence getText(int i10) {
        return getResources().getText(i10);
    }

    @Deprecated
    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    public View getView() {
        return this.mView;
    }

    @NonNull
    public androidx.lifecycle.r getViewLifecycleOwner() {
        T t10 = this.mViewLifecycleOwner;
        if (t10 != null) {
            return t10;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner for " + this + " when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    @NonNull
    public AbstractC1177x getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    @Override // androidx.lifecycle.W
    @NonNull
    public androidx.lifecycle.V getViewModelStore() {
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (n() != AbstractC1164j.b.INITIALIZED.ordinal()) {
            return this.mFragmentManager.D0(this);
        }
        throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    void initState() {
        p();
        this.mPreviousWho = this.mWho;
        this.mWho = UUID.randomUUID().toString();
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = new H();
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
    }

    public final boolean isAdded() {
        return this.mHost != null && this.mAdded;
    }

    public final boolean isDetached() {
        return this.mDetached;
    }

    public final boolean isHidden() {
        if (this.mHidden) {
            return true;
        }
        G g10 = this.mFragmentManager;
        return g10 != null && g10.L0(this.mParentFragment);
    }

    final boolean isInBackStack() {
        return this.mBackStackNesting > 0;
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    public final boolean isMenuVisible() {
        if (!this.mMenuVisible) {
            return false;
        }
        G g10 = this.mFragmentManager;
        return g10 == null || g10.M0(this.mParentFragment);
    }

    boolean isPostponed() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return false;
        }
        return kVar.f10108t;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    public final boolean isResumed() {
        return this.mState >= 7;
    }

    public final boolean isStateSaved() {
        G g10 = this.mFragmentManager;
        if (g10 == null) {
            return false;
        }
        return g10.P0();
    }

    public final boolean isVisible() {
        View view;
        return (!isAdded() || isHidden() || (view = this.mView) == null || view.getWindowToken() == null || this.mView.getVisibility() != 0) ? false : true;
    }

    void noteStateNotSaved() {
        this.mChildFragmentManager.U0();
    }

    @Deprecated
    public void onActivityCreated(Bundle bundle) {
        this.mCalled = true;
    }

    @Deprecated
    public void onActivityResult(int i10, int i11, Intent intent) {
        if (G.I0(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i10 + " resultCode: " + i11 + " data: " + intent);
        }
    }

    public void onAttach(@NonNull Context context) {
        this.mCalled = true;
        AbstractC1153y abstractC1153y = this.mHost;
        Activity activityE = abstractC1153y == null ? null : abstractC1153y.e();
        if (activityE != null) {
            this.mCalled = false;
            onAttach(activityE);
        }
    }

    @Deprecated
    public void onAttachFragment(@NonNull ComponentCallbacksC1144o componentCallbacksC1144o) {
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        this.mCalled = true;
    }

    public boolean onContextItemSelected(@NonNull MenuItem menuItem) {
        return false;
    }

    public void onCreate(Bundle bundle) {
        this.mCalled = true;
        restoreChildFragmentState();
        if (this.mChildFragmentManager.O0(1)) {
            return;
        }
        this.mChildFragmentManager.A();
    }

    public Animation onCreateAnimation(int i10, boolean z9, int i11) {
        return null;
    }

    public Animator onCreateAnimator(int i10, boolean z9, int i11) {
        return null;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(@NonNull ContextMenu contextMenu, @NonNull View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Deprecated
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater menuInflater) {
    }

    public View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i10 = this.mContentLayoutId;
        if (i10 != 0) {
            return layoutInflater.inflate(i10, viewGroup, false);
        }
        return null;
    }

    public void onDestroy() {
        this.mCalled = true;
    }

    @Deprecated
    public void onDestroyOptionsMenu() {
    }

    public void onDestroyView() {
        this.mCalled = true;
    }

    public void onDetach() {
        this.mCalled = true;
    }

    @NonNull
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    public void onHiddenChanged(boolean z9) {
    }

    public void onInflate(@NonNull Context context, @NonNull AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
        AbstractC1153y abstractC1153y = this.mHost;
        Activity activityE = abstractC1153y == null ? null : abstractC1153y.e();
        if (activityE != null) {
            this.mCalled = false;
            onInflate(activityE, attributeSet, bundle);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.mCalled = true;
    }

    public void onMultiWindowModeChanged(boolean z9) {
    }

    @Deprecated
    public boolean onOptionsItemSelected(@NonNull MenuItem menuItem) {
        return false;
    }

    @Deprecated
    public void onOptionsMenuClosed(@NonNull Menu menu) {
    }

    public void onPause() {
        this.mCalled = true;
    }

    public void onPictureInPictureModeChanged(boolean z9) {
    }

    @Deprecated
    public void onPrepareOptionsMenu(@NonNull Menu menu) {
    }

    public void onPrimaryNavigationFragmentChanged(boolean z9) {
    }

    @Deprecated
    public void onRequestPermissionsResult(int i10, @NonNull String[] strArr, @NonNull int[] iArr) {
    }

    public void onResume() {
        this.mCalled = true;
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onStart() {
        this.mCalled = true;
    }

    public void onStop() {
        this.mCalled = true;
    }

    public void onViewCreated(@NonNull View view, Bundle bundle) {
    }

    public void onViewStateRestored(Bundle bundle) {
        this.mCalled = true;
    }

    void performActivityCreated(Bundle bundle) {
        this.mChildFragmentManager.U0();
        this.mState = 3;
        this.mCalled = false;
        onActivityCreated(bundle);
        if (this.mCalled) {
            s();
            this.mChildFragmentManager.w();
        } else {
            throw new a0("Fragment " + this + " did not call through to super.onActivityCreated()");
        }
    }

    void performAttach() {
        ArrayList<n> arrayList = this.mOnPreAttachedListeners;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            n nVar = arrayList.get(i10);
            i10++;
            nVar.a();
        }
        this.mOnPreAttachedListeners.clear();
        this.mChildFragmentManager.l(this.mHost, createFragmentContainer(), this);
        this.mState = 0;
        this.mCalled = false;
        onAttach(this.mHost.f());
        if (this.mCalled) {
            this.mFragmentManager.G(this);
            this.mChildFragmentManager.x();
        } else {
            throw new a0("Fragment " + this + " did not call through to super.onAttach()");
        }
    }

    void performConfigurationChanged(@NonNull Configuration configuration) {
        onConfigurationChanged(configuration);
    }

    boolean performContextItemSelected(@NonNull MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (onContextItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.z(menuItem);
    }

    void performCreate(Bundle bundle) {
        this.mChildFragmentManager.U0();
        this.mState = 1;
        this.mCalled = false;
        this.mLifecycleRegistry.a(new g());
        onCreate(bundle);
        this.mIsCreated = true;
        if (this.mCalled) {
            this.mLifecycleRegistry.i(AbstractC1164j.a.ON_CREATE);
            return;
        }
        throw new a0("Fragment " + this + " did not call through to super.onCreate()");
    }

    boolean performCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater menuInflater) {
        boolean z9 = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onCreateOptionsMenu(menu, menuInflater);
            z9 = true;
        }
        return this.mChildFragmentManager.B(menu, menuInflater) | z9;
    }

    void performCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.mChildFragmentManager.U0();
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new T(this, getViewModelStore(), new Runnable() { // from class: androidx.fragment.app.n
            @Override // java.lang.Runnable
            public final void run() {
                ComponentCallbacksC1144o.l(this.f10070a);
            }
        });
        View viewOnCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        this.mView = viewOnCreateView;
        if (viewOnCreateView == null) {
            if (this.mViewLifecycleOwner.c()) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.mViewLifecycleOwner = null;
            return;
        }
        this.mViewLifecycleOwner.b();
        if (G.I0(3)) {
            Log.d("FragmentManager", "Setting ViewLifecycleOwner on View " + this.mView + " for Fragment " + this);
        }
        androidx.lifecycle.X.a(this.mView, this.mViewLifecycleOwner);
        androidx.lifecycle.Y.a(this.mView, this.mViewLifecycleOwner);
        p251z0.g.a(this.mView, this.mViewLifecycleOwner);
        this.mViewLifecycleOwnerLiveData.n(this.mViewLifecycleOwner);
    }

    void performDestroy() {
        this.mChildFragmentManager.C();
        this.mLifecycleRegistry.i(AbstractC1164j.a.ON_DESTROY);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (this.mCalled) {
            return;
        }
        throw new a0("Fragment " + this + " did not call through to super.onDestroy()");
    }

    void performDestroyView() {
        this.mChildFragmentManager.D();
        if (this.mView != null && this.mViewLifecycleOwner.getLifecycle().b().d(AbstractC1164j.b.CREATED)) {
            this.mViewLifecycleOwner.a(AbstractC1164j.a.ON_DESTROY);
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (this.mCalled) {
            androidx.loader.app.a.b(this).d();
            this.mPerformedCreateView = false;
        } else {
            throw new a0("Fragment " + this + " did not call through to super.onDestroyView()");
        }
    }

    void performDetach() {
        this.mState = -1;
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        if (this.mCalled) {
            if (this.mChildFragmentManager.H0()) {
                return;
            }
            this.mChildFragmentManager.C();
            this.mChildFragmentManager = new H();
            return;
        }
        throw new a0("Fragment " + this + " did not call through to super.onDetach()");
    }

    @NonNull
    LayoutInflater performGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = onGetLayoutInflater(bundle);
        this.mLayoutInflater = layoutInflaterOnGetLayoutInflater;
        return layoutInflaterOnGetLayoutInflater;
    }

    void performLowMemory() {
        onLowMemory();
    }

    void performMultiWindowModeChanged(boolean z9) {
        onMultiWindowModeChanged(z9);
    }

    boolean performOptionsItemSelected(@NonNull MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible && onOptionsItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.I(menuItem);
    }

    void performOptionsMenuClosed(@NonNull Menu menu) {
        if (this.mHidden) {
            return;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onOptionsMenuClosed(menu);
        }
        this.mChildFragmentManager.J(menu);
    }

    void performPause() {
        this.mChildFragmentManager.L();
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(AbstractC1164j.a.ON_PAUSE);
        }
        this.mLifecycleRegistry.i(AbstractC1164j.a.ON_PAUSE);
        this.mState = 6;
        this.mCalled = false;
        onPause();
        if (this.mCalled) {
            return;
        }
        throw new a0("Fragment " + this + " did not call through to super.onPause()");
    }

    void performPictureInPictureModeChanged(boolean z9) {
        onPictureInPictureModeChanged(z9);
    }

    boolean performPrepareOptionsMenu(@NonNull Menu menu) {
        boolean z9 = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onPrepareOptionsMenu(menu);
            z9 = true;
        }
        return this.mChildFragmentManager.N(menu) | z9;
    }

    void performPrimaryNavigationFragmentChanged() {
        boolean zN0 = this.mFragmentManager.N0(this);
        Boolean bool = this.mIsPrimaryNavigationFragment;
        if (bool == null || bool.booleanValue() != zN0) {
            this.mIsPrimaryNavigationFragment = Boolean.valueOf(zN0);
            onPrimaryNavigationFragmentChanged(zN0);
            this.mChildFragmentManager.O();
        }
    }

    void performResume() {
        this.mChildFragmentManager.U0();
        this.mChildFragmentManager.Z(true);
        this.mState = 7;
        this.mCalled = false;
        onResume();
        if (!this.mCalled) {
            throw new a0("Fragment " + this + " did not call through to super.onResume()");
        }
        C1173t c1173t = this.mLifecycleRegistry;
        AbstractC1164j.a aVar = AbstractC1164j.a.ON_RESUME;
        c1173t.i(aVar);
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(aVar);
        }
        this.mChildFragmentManager.P();
    }

    void performSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
    }

    void performStart() {
        this.mChildFragmentManager.U0();
        this.mChildFragmentManager.Z(true);
        this.mState = 5;
        this.mCalled = false;
        onStart();
        if (!this.mCalled) {
            throw new a0("Fragment " + this + " did not call through to super.onStart()");
        }
        C1173t c1173t = this.mLifecycleRegistry;
        AbstractC1164j.a aVar = AbstractC1164j.a.ON_START;
        c1173t.i(aVar);
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(aVar);
        }
        this.mChildFragmentManager.Q();
    }

    void performStop() {
        this.mChildFragmentManager.S();
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(AbstractC1164j.a.ON_STOP);
        }
        this.mLifecycleRegistry.i(AbstractC1164j.a.ON_STOP);
        this.mState = 4;
        this.mCalled = false;
        onStop();
        if (this.mCalled) {
            return;
        }
        throw new a0("Fragment " + this + " did not call through to super.onStop()");
    }

    void performViewCreated() {
        Bundle bundle = this.mSavedFragmentState;
        onViewCreated(this.mView, bundle != null ? bundle.getBundle("savedInstanceState") : null);
        this.mChildFragmentManager.T();
    }

    public void postponeEnterTransition() {
        m().f10108t = true;
    }

    @NonNull
    public final <I, O> p040e.c registerForActivityResult(@NonNull p050f.a aVar, @NonNull p040e.b bVar) {
        return q(aVar, new h(), bVar);
    }

    public void registerForContextMenu(@NonNull View view) {
        view.setOnCreateContextMenuListener(this);
    }

    @Deprecated
    public final void requestPermissions(@NonNull String[] strArr, int i10) {
        if (this.mHost != null) {
            getParentFragmentManager().Q0(this, strArr, i10);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    @NonNull
    public final AbstractActivityC1148t requireActivity() {
        AbstractActivityC1148t activity = getActivity();
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    @NonNull
    public final Bundle requireArguments() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        throw new IllegalStateException("Fragment " + this + " does not have any arguments.");
    }

    @NonNull
    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    @NonNull
    @Deprecated
    public final G requireFragmentManager() {
        return getParentFragmentManager();
    }

    @NonNull
    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a host.");
    }

    @NonNull
    public final ComponentCallbacksC1144o requireParentFragment() {
        ComponentCallbacksC1144o parentFragment = getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        if (getContext() == null) {
            throw new IllegalStateException("Fragment " + this + " is not attached to any Fragment or host");
        }
        throw new IllegalStateException("Fragment " + this + " is not a child Fragment, it is directly attached to " + getContext());
    }

    @NonNull
    public final View requireView() {
        View view = getView();
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    void restoreChildFragmentState() {
        Bundle bundle;
        Bundle bundle2 = this.mSavedFragmentState;
        if (bundle2 == null || (bundle = bundle2.getBundle("childFragmentManager")) == null) {
            return;
        }
        this.mChildFragmentManager.h1(bundle);
        this.mChildFragmentManager.A();
    }

    final void restoreViewState(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.mSavedViewState;
        if (sparseArray != null) {
            this.mView.restoreHierarchyState(sparseArray);
            this.mSavedViewState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (this.mCalled) {
            if (this.mView != null) {
                this.mViewLifecycleOwner.a(AbstractC1164j.a.ON_CREATE);
            }
        } else {
            throw new a0("Fragment " + this + " did not call through to super.onViewStateRestored()");
        }
    }

    public void setAllowEnterTransitionOverlap(boolean z9) {
        m().f10105q = Boolean.valueOf(z9);
    }

    public void setAllowReturnTransitionOverlap(boolean z9) {
        m().f10104p = Boolean.valueOf(z9);
    }

    void setAnimations(int i10, int i11, int i12, int i13) {
        if (this.mAnimationInfo == null && i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            return;
        }
        m().f10091c = i10;
        m().f10092d = i11;
        m().f10093e = i12;
        m().f10094f = i13;
    }

    public void setArguments(Bundle bundle) {
        if (this.mFragmentManager != null && isStateSaved()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.mArguments = bundle;
    }

    public void setEnterSharedElementCallback(androidx.core.app.y yVar) {
        m().getClass();
    }

    public void setEnterTransition(Object obj) {
        m().f10098j = obj;
    }

    public void setExitSharedElementCallback(androidx.core.app.y yVar) {
        m().getClass();
    }

    public void setExitTransition(Object obj) {
        m().f10100l = obj;
    }

    void setFocusedView(View view) {
        m().f10107s = view;
    }

    @Deprecated
    public void setHasOptionsMenu(boolean z9) {
        if (this.mHasMenu != z9) {
            this.mHasMenu = z9;
            if (!isAdded() || isHidden()) {
                return;
            }
            this.mHost.o();
        }
    }

    public void setInitialSavedState(C0157o c0157o) {
        Bundle bundle;
        if (this.mFragmentManager != null) {
            throw new IllegalStateException("Fragment already added");
        }
        if (c0157o == null || (bundle = c0157o.f10109a) == null) {
            bundle = null;
        }
        this.mSavedFragmentState = bundle;
    }

    public void setMenuVisibility(boolean z9) {
        if (this.mMenuVisible != z9) {
            this.mMenuVisible = z9;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                this.mHost.o();
            }
        }
    }

    void setNextTransition(int i10) {
        if (this.mAnimationInfo == null && i10 == 0) {
            return;
        }
        m();
        this.mAnimationInfo.f10095g = i10;
    }

    void setPopDirection(boolean z9) {
        if (this.mAnimationInfo == null) {
            return;
        }
        m().f10090b = z9;
    }

    void setPostOnViewCreatedAlpha(float f10) {
        m().f10106r = f10;
    }

    public void setReenterTransition(Object obj) {
        m().f10101m = obj;
    }

    @Deprecated
    public void setRetainInstance(boolean z9) {
        p081i0.c.k(this);
        this.mRetainInstance = z9;
        G g10 = this.mFragmentManager;
        if (g10 == null) {
            this.mRetainInstanceChangedWhileDetached = true;
        } else if (z9) {
            g10.j(this);
        } else {
            g10.f1(this);
        }
    }

    public void setReturnTransition(Object obj) {
        m().f10099k = obj;
    }

    public void setSharedElementEnterTransition(Object obj) {
        m().f10102n = obj;
    }

    void setSharedElementNames(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        m();
        k kVar = this.mAnimationInfo;
        kVar.f10096h = arrayList;
        kVar.f10097i = arrayList2;
    }

    public void setSharedElementReturnTransition(Object obj) {
        m().f10103o = obj;
    }

    @Deprecated
    public void setTargetFragment(ComponentCallbacksC1144o componentCallbacksC1144o, int i10) {
        if (componentCallbacksC1144o != null) {
            p081i0.c.l(this, componentCallbacksC1144o, i10);
        }
        G g10 = this.mFragmentManager;
        G g11 = componentCallbacksC1144o != null ? componentCallbacksC1144o.mFragmentManager : null;
        if (g10 != null && g11 != null && g10 != g11) {
            throw new IllegalArgumentException("Fragment " + componentCallbacksC1144o + " must share the same FragmentManager to be set as a target fragment");
        }
        for (ComponentCallbacksC1144o componentCallbacksC1144oO = componentCallbacksC1144o; componentCallbacksC1144oO != null; componentCallbacksC1144oO = componentCallbacksC1144oO.o(false)) {
            if (componentCallbacksC1144oO.equals(this)) {
                throw new IllegalArgumentException("Setting " + componentCallbacksC1144o + " as the target of " + this + " would create a target cycle");
            }
        }
        if (componentCallbacksC1144o == null) {
            this.mTargetWho = null;
            this.mTarget = null;
        } else if (this.mFragmentManager == null || componentCallbacksC1144o.mFragmentManager == null) {
            this.mTargetWho = null;
            this.mTarget = componentCallbacksC1144o;
        } else {
            this.mTargetWho = componentCallbacksC1144o.mWho;
            this.mTarget = null;
        }
        this.mTargetRequestCode = i10;
    }

    @Deprecated
    public void setUserVisibleHint(boolean z9) {
        p081i0.c.m(this, z9);
        if (!this.mUserVisibleHint && z9 && this.mState < 5 && this.mFragmentManager != null && isAdded() && this.mIsCreated) {
            G g10 = this.mFragmentManager;
            g10.W0(g10.u(this));
        }
        this.mUserVisibleHint = z9;
        this.mDeferStart = this.mState < 5 && !z9;
        if (this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = Boolean.valueOf(z9);
        }
    }

    public boolean shouldShowRequestPermissionRationale(@NonNull String str) {
        AbstractC1153y abstractC1153y = this.mHost;
        if (abstractC1153y != null) {
            return abstractC1153y.l(str);
        }
        return false;
    }

    public void startActivity(@NonNull Intent intent) {
        startActivity(intent, null);
    }

    @Deprecated
    public void startActivityForResult(@NonNull Intent intent, int i10) {
        startActivityForResult(intent, i10, null);
    }

    @Deprecated
    public void startIntentSenderForResult(@NonNull IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) {
        Bundle bundle2;
        if (this.mHost == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        if (G.I0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment ");
            sb.append(this);
            sb.append(" received the following in startIntentSenderForResult() requestCode: ");
            sb.append(i10);
            sb.append(" IntentSender: ");
            sb.append(intentSender);
            sb.append(" fillInIntent: ");
            sb.append(intent);
            sb.append(" options: ");
            bundle2 = bundle;
            sb.append(bundle2);
            Log.v("FragmentManager", sb.toString());
        } else {
            bundle2 = bundle;
        }
        getParentFragmentManager().S0(this, intentSender, i10, intent, i11, i12, i13, bundle2);
    }

    public void startPostponedEnterTransition() {
        if (this.mAnimationInfo == null || !m().f10108t) {
            return;
        }
        if (this.mHost == null) {
            m().f10108t = false;
        } else if (Looper.myLooper() != this.mHost.g().getLooper()) {
            this.mHost.g().postAtFrontOfQueue(new d());
        } else {
            callStartTransitionListener(true);
        }
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder(IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("}");
        sb.append(" (");
        sb.append(this.mWho);
        if (this.mFragmentId != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            sb.append(" tag=");
            sb.append(this.mTag);
        }
        sb.append(")");
        return sb.toString();
    }

    public void unregisterForContextMenu(@NonNull View view) {
        view.setOnCreateContextMenuListener(null);
    }

    @NonNull
    @Deprecated
    public static ComponentCallbacksC1144o instantiate(@NonNull Context context, @NonNull String str, Bundle bundle) {
        try {
            ComponentCallbacksC1144o componentCallbacksC1144o = (ComponentCallbacksC1144o) AbstractC1152x.d(context.getClassLoader(), str).getConstructor(null).newInstance(null);
            if (bundle == null) {
                return componentCallbacksC1144o;
            }
            bundle.setClassLoader(componentCallbacksC1144o.getClass().getClassLoader());
            componentCallbacksC1144o.setArguments(bundle);
            return componentCallbacksC1144o;
        } catch (IllegalAccessException e10) {
            throw new m("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e10);
        } catch (InstantiationException e11) {
            throw new m("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e11);
        } catch (NoSuchMethodException e12) {
            throw new m("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e12);
        } catch (InvocationTargetException e13) {
            throw new m("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e13);
        }
    }

    @NonNull
    public final String getString(int i10, Object... objArr) {
        return getResources().getString(i10, objArr);
    }

    public final void postponeEnterTransition(long j10, @NonNull TimeUnit timeUnit) {
        m().f10108t = true;
        Handler handler = this.mPostponedHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mPostponedDurationRunnable);
        }
        G g10 = this.mFragmentManager;
        if (g10 != null) {
            this.mPostponedHandler = g10.v0().g();
        } else {
            this.mPostponedHandler = new Handler(Looper.getMainLooper());
        }
        this.mPostponedHandler.removeCallbacks(this.mPostponedDurationRunnable);
        this.mPostponedHandler.postDelayed(this.mPostponedDurationRunnable, timeUnit.toMillis(j10));
    }

    @NonNull
    public final <I, O> p040e.c registerForActivityResult(@NonNull p050f.a aVar, @NonNull p040e.e eVar, @NonNull p040e.b bVar) {
        return q(aVar, new i(eVar), bVar);
    }

    public void startActivity(@NonNull Intent intent, Bundle bundle) {
        AbstractC1153y abstractC1153y = this.mHost;
        if (abstractC1153y != null) {
            abstractC1153y.m(this, intent, -1, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    @Deprecated
    public void startActivityForResult(@NonNull Intent intent, int i10, Bundle bundle) {
        if (this.mHost != null) {
            getParentFragmentManager().R0(this, intent, i10, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    @NonNull
    @Deprecated
    public LayoutInflater getLayoutInflater(Bundle bundle) {
        AbstractC1153y abstractC1153y = this.mHost;
        if (abstractC1153y != null) {
            LayoutInflater layoutInflaterJ = abstractC1153y.j();
            AbstractC0879u.a(layoutInflaterJ, this.mChildFragmentManager.w0());
            return layoutInflaterJ;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    @Deprecated
    public void onAttach(@NonNull Activity activity) {
        this.mCalled = true;
    }

    @Deprecated
    public void onInflate(@NonNull Activity activity, @NonNull AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
    }
}

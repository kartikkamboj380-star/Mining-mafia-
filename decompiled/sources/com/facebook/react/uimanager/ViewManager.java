package com.facebook.react.uimanager;

import android.content.Context;
import android.view.View;
import androidx.annotation.NonNull;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.InterfaceC1381s0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Stack;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ViewManager<T extends View, C extends InterfaceC1381s0> extends BaseJavaModule {
    private static final String TAG = "ViewManager";
    private U0 mDelegate;
    private HashMap<Integer, Stack<T>> mRecyclableViews;

    public ViewManager() {
        super(null);
        this.mDelegate = null;
        this.mRecyclableViews = null;
    }

    private U0 getOrCreateViewManagerDelegate() {
        U0 u10 = this.mDelegate;
        if (u10 != null) {
            return u10;
        }
        U0 delegate = getDelegate();
        this.mDelegate = delegate;
        return delegate;
    }

    private Stack<T> getRecyclableViewStack(int i10, boolean z9) {
        HashMap<Integer, Stack<T>> map = this.mRecyclableViews;
        if (map == null) {
            return null;
        }
        if (z9 && !map.containsKey(Integer.valueOf(i10))) {
            this.mRecyclableViews.put(Integer.valueOf(i10), new Stack<>());
        }
        return this.mRecyclableViews.get(Integer.valueOf(i10));
    }

    protected void addEventEmitters(@NonNull E0 e10, @NonNull T t10) {
    }

    public C createShadowNodeInstance() {
        throw new RuntimeException("ViewManager subclasses must implement createShadowNodeInstance()");
    }

    @NonNull
    public T createView(int i10, @NonNull E0 e10, C1385u0 c1385u0, D0 d10, N3.a aVar) {
        T t10 = (T) createViewInstance(i10, e10, c1385u0, d10);
        if (t10 instanceof N3.d) {
            ((N3.d) t10).setOnInterceptTouchEventListener(aVar);
        }
        return t10;
    }

    @NonNull
    protected T createViewInstance(int i10, @NonNull E0 e10, C1385u0 c1385u0, D0 d10) {
        Object objUpdateState;
        Stack<T> recyclableViewStack = getRecyclableViewStack(e10.c(), true);
        T t10 = (recyclableViewStack == null || recyclableViewStack.empty()) ? (T) createViewInstance(e10) : (T) recycleView(e10, recyclableViewStack.pop());
        t10.setId(i10);
        addEventEmitters(e10, t10);
        if (c1385u0 != null) {
            updateProperties(t10, c1385u0);
        }
        if (d10 != null && (objUpdateState = updateState(t10, c1385u0, d10)) != null) {
            updateExtraData(t10, objUpdateState);
        }
        return t10;
    }

    @NonNull
    protected abstract T createViewInstance(@NonNull E0 e10);

    protected boolean experimental_isPrefetchingEnabled() {
        return false;
    }

    public void experimental_prefetchResource(ReactContext reactContext, int i10, int i11, com.facebook.react.common.mapbuffer.a aVar) {
    }

    public Map<String, Integer> getCommandsMap() {
        return null;
    }

    protected U0 getDelegate() {
        if (this instanceof e1) {
            ReactSoftExceptionLogger.logSoftException(TAG, new ReactNoCrashSoftException("ViewManager using codegen must override getDelegate method (name: " + getName() + ")."));
        }
        return new V0.c(this);
    }

    public Map<String, Object> getExportedCustomBubblingEventTypeConstants() {
        return null;
    }

    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return null;
    }

    public Map<String, Object> getExportedViewConstants() {
        return null;
    }

    @Override // com.facebook.react.bridge.NativeModule
    @NonNull
    public abstract String getName();

    public Map<String, String> getNativeProps() {
        return (p084i3.a.f45070f && p204u3.i.a()) ? V0.f(getClass(), null) : V0.f(getClass(), getShadowNodeClass());
    }

    public abstract Class<? extends C> getShadowNodeClass();

    public long measure(Context context, ReadableMap readableMap, ReadableMap readableMap2, ReadableMap readableMap3, float f10, com.facebook.yoga.p pVar, float f11, com.facebook.yoga.p pVar2, float[] fArr) {
        return 0L;
    }

    protected void onAfterUpdateTransaction(@NonNull T t10) {
    }

    public void onDropViewInstance(@NonNull T t10) {
        View viewPrepareToRecycleView;
        Context context = t10.getContext();
        if (context == null) {
            Z1.a.m(TAG, "onDropViewInstance: view [" + t10.getId() + "] has a null context");
            return;
        }
        if (!(context instanceof E0)) {
            Z1.a.m(TAG, "onDropViewInstance: view [" + t10.getId() + "] has a context that is not a ThemedReactContext: " + context);
            return;
        }
        E0 e10 = (E0) context;
        Stack<T> recyclableViewStack = getRecyclableViewStack(e10.c(), false);
        if (recyclableViewStack == null || (viewPrepareToRecycleView = prepareToRecycleView(e10, t10)) == null) {
            return;
        }
        p004a3.a.b(viewPrepareToRecycleView.getParent() == null, "Recycled view [" + t10.getId() + "] should not be attached to a parent. View: " + t10 + " Parent: " + viewPrepareToRecycleView.getParent() + " ThemedReactContext: " + e10);
        recyclableViewStack.push(viewPrepareToRecycleView);
    }

    public void onSurfaceStopped(int i10) {
        HashMap<Integer, Stack<T>> map = this.mRecyclableViews;
        if (map != null) {
            map.remove(Integer.valueOf(i10));
        }
    }

    protected abstract T prepareToRecycleView(@NonNull E0 e10, @NonNull T t10);

    @Deprecated
    public void receiveCommand(@NonNull T t10, int i10, ReadableArray readableArray) {
    }

    protected T recycleView(@NonNull E0 e10, @NonNull T t10) {
        return t10;
    }

    public void setPadding(T t10, int i10, int i11, int i12, int i13) {
    }

    protected void setupViewRecycling() {
        if (p204u3.b.n()) {
            this.mRecyclableViews = new HashMap<>();
        }
    }

    void trimMemory() {
        if (this.mRecyclableViews != null) {
            this.mRecyclableViews = new HashMap<>();
        }
    }

    public abstract void updateExtraData(@NonNull T t10, Object obj);

    public void updateProperties(@NonNull T t10, C1385u0 c1385u0) {
        U0 orCreateViewManagerDelegate = getOrCreateViewManagerDelegate();
        Iterator<Map.Entry<String, Object>> entryIterator = c1385u0.d().getEntryIterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, Object> next = entryIterator.next();
            orCreateViewManagerDelegate.a(t10, next.getKey(), next.getValue());
        }
        onAfterUpdateTransaction(t10);
    }

    public Object updateState(@NonNull T t10, C1385u0 c1385u0, D0 d10) {
        return null;
    }

    @NonNull
    public C createShadowNodeInstance(@NonNull ReactApplicationContext reactApplicationContext) {
        return (C) createShadowNodeInstance();
    }

    public void receiveCommand(@NonNull T t10, String str, ReadableArray readableArray) {
        getOrCreateViewManagerDelegate().b(t10, str, readableArray);
    }

    public ViewManager(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mDelegate = null;
        this.mRecyclableViews = null;
    }
}

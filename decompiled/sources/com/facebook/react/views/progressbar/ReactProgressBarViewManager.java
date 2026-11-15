package com.facebook.react.views.progressbar;

import X3.C1026c;
import X3.InterfaceC1028d;
import android.R;
import android.content.Context;
import android.util.Pair;
import android.view.View;
import android.widget.ProgressBar;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.C1356f0;
import com.facebook.react.uimanager.E0;
import com.facebook.react.uimanager.U0;
import com.facebook.yoga.p;
import com.facebook.yoga.q;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    java.lang.IllegalArgumentException: Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.
    	at kotlin.metadata.jvm.internal.JvmReadUtils.checkMetadataVersionForRead(JvmReadUtils.kt:79)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:46)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:68)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:31)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    */
/* JADX INFO: loaded from: classes2.dex */
@p234x3.a(name = ReactProgressBarViewManager.REACT_CLASS)
@Metadata
public final class ReactProgressBarViewManager extends BaseViewManager<com.facebook.react.views.progressbar.a, b> implements InterfaceC1028d {

    @NotNull
    public static final String DEFAULT_STYLE = "Normal";

    @NotNull
    public static final String PROP_ANIMATING = "animating";

    @NotNull
    public static final String PROP_ATTR = "typeAttr";

    @NotNull
    public static final String PROP_INDETERMINATE = "indeterminate";

    @NotNull
    public static final String PROP_PROGRESS = "progress";

    @NotNull
    public static final String PROP_STYLE = "styleAttr";

    @NotNull
    public static final String REACT_CLASS = "AndroidProgressBar";

    @NotNull
    public static final a Companion = new a(null);

    @NotNull
    private static final Object progressBarCtorLock = new Object();

    @NotNull
    private final WeakHashMap<Integer, Pair<Integer, Integer>> measuredStyles = new WeakHashMap<>();

    @NotNull
    private final U0 delegate = new C1026c(this);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ProgressBar a(Context context, int i10) {
            ProgressBar progressBar;
            synchronized (ReactProgressBarViewManager.progressBarCtorLock) {
                progressBar = new ProgressBar(context, null, i10);
            }
            return progressBar;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:39:0x0065  */
        /* JADX WARN: Instruction removed from duplicated block: B:39:0x0065, please report this as an issue */
        public final int b(String str) {
            if (str == null) {
                Z1.a.I("ReactNative", "ProgressBar needs to have a style, null received");
                return R.attr.progressBarStyle;
            }
            switch (str) {
                case "Normal":
                    if (!str.equals(ReactProgressBarViewManager.DEFAULT_STYLE)) {
                        Z1.a.I("ReactNative", "Unknown ProgressBar style: " + str);
                    }
                    return R.attr.progressBarStyle;
                case "SmallInverse":
                    return R.attr.progressBarStyleSmallInverse;
                case "Horizontal":
                    return R.attr.progressBarStyleHorizontal;
                case "Inverse":
                    return R.attr.progressBarStyleInverse;
                case "LargeInverse":
                    return R.attr.progressBarStyleLargeInverse;
                case "Large":
                    return R.attr.progressBarStyleLarge;
                case "Small":
                    return R.attr.progressBarStyleSmall;
                default:
                    Z1.a.I("ReactNative", "Unknown ProgressBar style: " + str);
            }
        }

        private a() {
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    protected U0 getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public Class<b> getShadowNodeClass() {
        return b.class;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public long measure(@NotNull Context context, @NotNull ReadableMap localData, @NotNull ReadableMap props, @NotNull ReadableMap state, float f10, @NotNull p widthMode, float f11, @NotNull p heightMode, @Nullable float[] fArr) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(localData, "localData");
        Intrinsics.checkNotNullParameter(props, "props");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widthMode, "widthMode");
        Intrinsics.checkNotNullParameter(heightMode, "heightMode");
        a aVar = Companion;
        int iB = aVar.b(props.getString(PROP_STYLE));
        WeakHashMap<Integer, Pair<Integer, Integer>> weakHashMap = this.measuredStyles;
        Integer numValueOf = Integer.valueOf(iB);
        Pair<Integer, Integer> pairCreate = weakHashMap.get(numValueOf);
        if (pairCreate == null) {
            ProgressBar progressBarA = aVar.a(context, iB);
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            progressBarA.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            pairCreate = Pair.create(Integer.valueOf(progressBarA.getMeasuredWidth()), Integer.valueOf(progressBarA.getMeasuredHeight()));
            weakHashMap.put(numValueOf, pairCreate);
        }
        Pair<Integer, Integer> pair = pairCreate;
        return q.a(C1356f0.g(((Number) pair.first).intValue()), C1356f0.g(((Number) pair.second).intValue()));
    }

    @Override // X3.InterfaceC1028d
    @O3.a(name = PROP_ATTR)
    public void setTypeAttr(@NotNull com.facebook.react.views.progressbar.a view, @Nullable String str) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(@NotNull com.facebook.react.views.progressbar.a root, @NotNull Object extraData) {
        Intrinsics.checkNotNullParameter(root, "root");
        Intrinsics.checkNotNullParameter(extraData, "extraData");
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public b createShadowNodeInstance() {
        return new b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public com.facebook.react.views.progressbar.a createViewInstance(@NotNull E0 context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new com.facebook.react.views.progressbar.a(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(@NotNull com.facebook.react.views.progressbar.a view) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.a();
    }

    @Override // X3.InterfaceC1028d
    @O3.a(name = PROP_ANIMATING)
    public void setAnimating(@NotNull com.facebook.react.views.progressbar.a view, boolean z9) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setAnimating$ReactAndroid_release(z9);
    }

    @Override // X3.InterfaceC1028d
    @O3.a(customType = "Color", name = "color")
    public void setColor(@NotNull com.facebook.react.views.progressbar.a view, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setColor$ReactAndroid_release(num);
    }

    @Override // X3.InterfaceC1028d
    @O3.a(name = PROP_INDETERMINATE)
    public void setIndeterminate(@NotNull com.facebook.react.views.progressbar.a view, boolean z9) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setIndeterminate$ReactAndroid_release(z9);
    }

    @Override // X3.InterfaceC1028d
    @O3.a(name = PROP_PROGRESS)
    public void setProgress(@NotNull com.facebook.react.views.progressbar.a view, double d10) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setProgress$ReactAndroid_release(d10);
    }

    @Override // X3.InterfaceC1028d
    @O3.a(name = PROP_STYLE)
    public void setStyleAttr(@NotNull com.facebook.react.views.progressbar.a view, @Nullable String str) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setStyle$ReactAndroid_release(str);
    }

    @Override // X3.InterfaceC1028d
    public void setTestID(@NotNull com.facebook.react.views.progressbar.a view, @Nullable String str) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.setTestId(view, str);
    }
}

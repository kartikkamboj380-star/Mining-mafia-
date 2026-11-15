package com.facebook.react.uimanager;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
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
@Metadata
public abstract class ViewGroupManager<T extends ViewGroup> extends BaseViewManager<T, U> implements N {

    @NotNull
    public static final a Companion = new a(null);

    @NotNull
    private static final WeakHashMap<View, Integer> zIndexHash = new WeakHashMap<>();

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Integer a(View view) {
            return (Integer) ViewGroupManager.zIndexHash.get(view);
        }

        public final void b(View view, int i10) {
            Intrinsics.checkNotNullParameter(view, "view");
            ViewGroupManager.zIndexHash.put(view, Integer.valueOf(i10));
        }

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ViewGroupManager() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Nullable
    public static final Integer getViewZIndex(@Nullable View view) {
        return Companion.a(view);
    }

    public static final void setViewZIndex(@NotNull View view, int i10) {
        Companion.b(view, i10);
    }

    public final void addViews(@NotNull T parent, @NotNull List<? extends View> views) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(views, "views");
        UiThreadUtil.assertOnUiThread();
        int i10 = 0;
        for (Object obj : views) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.r();
            }
            addView((ViewGroup) parent, (View) obj, i10);
            i10 = i11;
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public Class<? extends U> getShadowNodeClass() {
        return U.class;
    }

    @Override // com.facebook.react.uimanager.O
    public boolean needsCustomLayoutForChildren() {
        return false;
    }

    public /* bridge */ /* synthetic */ void removeAllViews(@NotNull View view) {
        super.removeAllViews(view);
    }

    public void removeView(@NotNull T parent, @NotNull View view) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(view, "view");
        UiThreadUtil.assertOnUiThread();
        int childCount = getChildCount((ViewGroup) parent);
        for (int i10 = 0; i10 < childCount; i10++) {
            if (getChildAt((ViewGroup) parent, i10) == view) {
                removeViewAt((ViewGroup) parent, i10);
                return;
            }
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(@NotNull T root, @NotNull Object extraData) {
        Intrinsics.checkNotNullParameter(root, "root");
        Intrinsics.checkNotNullParameter(extraData, "extraData");
    }

    public /* synthetic */ ViewGroupManager(ReactApplicationContext reactApplicationContext, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : reactApplicationContext);
    }

    @Override // com.facebook.react.uimanager.N
    public void addView(@NotNull T parent, @NotNull View child, int i10) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        parent.addView(child, i10);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public U createShadowNodeInstance() {
        return new U();
    }

    @Override // com.facebook.react.uimanager.N
    @Nullable
    public View getChildAt(@NotNull T parent, int i10) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return parent.getChildAt(i10);
    }

    @Override // com.facebook.react.uimanager.N
    public int getChildCount(@NotNull T parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return parent.getChildCount();
    }

    @Override // com.facebook.react.uimanager.N
    public void removeViewAt(@NotNull T parent, int i10) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        UiThreadUtil.assertOnUiThread();
        parent.removeViewAt(i10);
    }

    public ViewGroupManager(@Nullable ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }
}

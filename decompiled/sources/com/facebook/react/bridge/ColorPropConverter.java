package com.facebook.react.bridge;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.ColorSpace;
import android.os.Build;
import android.util.TypedValue;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
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
/* JADX INFO: loaded from: classes.dex */
@Metadata
public final class ColorPropConverter {

    @NotNull
    private static final String ATTR = "attr";

    @NotNull
    private static final String ATTR_SEGMENT = "attr/";

    @NotNull
    public static final ColorPropConverter INSTANCE = new ColorPropConverter();

    @NotNull
    private static final String JSON_KEY = "resource_paths";

    @NotNull
    private static final String PACKAGE_DELIMITER = ":";

    @NotNull
    private static final String PATH_DELIMITER = "/";

    @NotNull
    private static final String PREFIX_ATTR = "?";

    @NotNull
    private static final String PREFIX_RESOURCE = "@";

    private ColorPropConverter() {
    }

    @Nullable
    public static final Integer getColor(@Nullable Object obj, @NotNull Context context) {
        Color colorInstance;
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            if (INSTANCE.supportWideGamut() && (colorInstance = getColorInstance(obj, context)) != null) {
                return Integer.valueOf(colorInstance.toArgb());
            }
        } catch (JSApplicationCausedNativeException e10) {
            Z1.a.L("ReactNative", e10, "Error extracting color from WideGamut", new Object[0]);
        }
        return INSTANCE.getColorInteger(obj, context);
    }

    @Nullable
    public static final Color getColorInstance(@Nullable Object obj, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (obj == null) {
            return null;
        }
        ColorPropConverter colorPropConverter = INSTANCE;
        if (colorPropConverter.supportWideGamut() && (obj instanceof Double)) {
            return Color.valueOf((int) ((Number) obj).doubleValue());
        }
        if (!(obj instanceof ReadableMap)) {
            throw new JSApplicationCausedNativeException("ColorValue: the value must be a number or Object.");
        }
        if (colorPropConverter.supportWideGamut()) {
            ReadableMap readableMap = (ReadableMap) obj;
            if (readableMap.hasKey("space")) {
                ColorSpace colorSpace = ColorSpace.get(Intrinsics.b(readableMap.getString("space"), "display-p3") ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB);
                Intrinsics.checkNotNullExpressionValue(colorSpace, "get(...)");
                return Color.valueOf(Color.pack((float) readableMap.getDouble(AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ), (float) readableMap.getDouble("g"), (float) readableMap.getDouble("b"), (float) readableMap.getDouble("a"), colorSpace));
            }
        }
        ReadableArray array = ((ReadableMap) obj).getArray(JSON_KEY);
        if (array == null) {
            throw new JSApplicationCausedNativeException("ColorValue: The `resource_paths` must be an array of color resource path strings.");
        }
        int size = array.size();
        for (int i10 = 0; i10 < size; i10++) {
            Integer numResolveResourcePath = resolveResourcePath(context, array.getString(i10));
            if (INSTANCE.supportWideGamut() && numResolveResourcePath != null) {
                return Color.valueOf(numResolveResourcePath.intValue());
            }
        }
        throw new JSApplicationCausedNativeException("ColorValue: None of the paths in the `resource_paths` array resolved to a color resource.");
    }

    private final Integer getColorInteger(Object obj, Context context) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Double) {
            return Integer.valueOf((int) ((Number) obj).doubleValue());
        }
        if (context == null) {
            throw new IllegalStateException("Required value was null.");
        }
        if (!(obj instanceof ReadableMap)) {
            throw new JSApplicationCausedNativeException("ColorValue: the value must be a number or Object.");
        }
        ReadableMap readableMap = (ReadableMap) obj;
        if (readableMap.hasKey("space")) {
            float f10 = (float) readableMap.getDouble(AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ);
            float f11 = 255;
            return Integer.valueOf(Color.argb((int) (((float) readableMap.getDouble("a")) * f11), (int) (f10 * f11), (int) (((float) readableMap.getDouble("g")) * f11), (int) (((float) readableMap.getDouble("b")) * f11)));
        }
        ReadableArray array = readableMap.getArray(JSON_KEY);
        if (array == null) {
            throw new JSApplicationCausedNativeException("ColorValue: The `resource_paths` must be an array of color resource path strings.");
        }
        int size = array.size();
        for (int i10 = 0; i10 < size; i10++) {
            Integer numResolveResourcePath = resolveResourcePath(context, array.getString(i10));
            if (numResolveResourcePath != null) {
                return numResolveResourcePath;
            }
        }
        throw new JSApplicationCausedNativeException("ColorValue: None of the paths in the `resource_paths` array resolved to a color resource.");
    }

    private final int resolveResource(Context context, String str) {
        String str2;
        List listSplit$default = StringsKt.split$default(str, new String[]{PACKAGE_DELIMITER}, false, 0, 6, null);
        String packageName = context.getPackageName();
        if (listSplit$default.size() > 1) {
            packageName = (String) listSplit$default.get(0);
            str2 = (String) listSplit$default.get(1);
        } else {
            str2 = str;
        }
        List listSplit$default2 = StringsKt.split$default(str2, new String[]{PATH_DELIMITER}, false, 0, 6, null);
        String str3 = (String) listSplit$default2.get(0);
        return E.h.d(context.getResources(), context.getResources().getIdentifier((String) listSplit$default2.get(1), str3, packageName), context.getTheme());
    }

    @Nullable
    public static final Integer resolveResourcePath(@NotNull Context context, @Nullable String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (str != null && str.length() != 0) {
            boolean zJ = StringsKt.J(str, PREFIX_RESOURCE, false, 2, null);
            boolean zJ2 = StringsKt.J(str, PREFIX_ATTR, false, 2, null);
            String strSubstring = str.substring(1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            try {
                if (zJ) {
                    return Integer.valueOf(INSTANCE.resolveResource(context, strSubstring));
                }
                if (zJ2) {
                    return Integer.valueOf(INSTANCE.resolveThemeAttribute(context, strSubstring));
                }
            } catch (Resources.NotFoundException unused) {
            }
        }
        return null;
    }

    private final int resolveThemeAttribute(Context context, String str) {
        String strF = StringsKt.F(str, ATTR_SEGMENT, "", false, 4, null);
        List listSplit$default = StringsKt.split$default(strF, new String[]{PACKAGE_DELIMITER}, false, 0, 6, null);
        String packageName = context.getPackageName();
        if (listSplit$default.size() > 1) {
            packageName = (String) listSplit$default.get(0);
            strF = (String) listSplit$default.get(1);
        }
        int identifier = context.getResources().getIdentifier(strF, ATTR, packageName);
        if (identifier == 0) {
            identifier = context.getResources().getIdentifier(strF, ATTR, "android");
        }
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(identifier, typedValue, true)) {
            return typedValue.data;
        }
        throw new Resources.NotFoundException();
    }

    private final boolean supportWideGamut() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static final int getColor(@Nullable Object obj, @NotNull Context context, int i10) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            Integer color = getColor(obj, context);
            return color != null ? color.intValue() : i10;
        } catch (JSApplicationCausedNativeException e10) {
            Z1.a.L("ReactNative", e10, "Error converting ColorValue", new Object[0]);
            return i10;
        }
    }
}

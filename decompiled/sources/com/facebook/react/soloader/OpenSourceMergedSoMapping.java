package com.facebook.react.soloader;

import com.facebook.soloader.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

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
public final class OpenSourceMergedSoMapping implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final OpenSourceMergedSoMapping f15303a = new OpenSourceMergedSoMapping();

    private OpenSourceMergedSoMapping() {
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.facebook.soloader.l
    public void a(String libraryName) {
        Intrinsics.checkNotNullParameter(libraryName, "libraryName");
        switch (libraryName.hashCode()) {
            case -1793638007:
                if (libraryName.equals("mapbufferjni")) {
                    libmapbufferjni_so();
                    break;
                }
                break;
            case -1624070447:
                if (libraryName.equals("rninstance")) {
                    librninstance_so();
                    break;
                }
                break;
            case -1570429553:
                if (libraryName.equals("reactnativejni")) {
                    libreactnativejni_so();
                    break;
                }
                break;
            case -1438915853:
                if (libraryName.equals("reactnativeblob")) {
                    libreactnativeblob_so();
                    break;
                }
                break;
            case -1382694412:
                if (libraryName.equals("react_featureflagsjni")) {
                    libreact_featureflagsjni_so();
                    break;
                }
                break;
            case -1259441509:
                if (libraryName.equals("reactnativejni_common")) {
                    libreactnativejni_common_so();
                    break;
                }
                break;
            case -1033318826:
                if (libraryName.equals("reactnative")) {
                    libreactnative_so();
                    break;
                }
                break;
            case -579037304:
                if (libraryName.equals("react_newarchdefaults")) {
                    libreact_newarchdefaults_so();
                    break;
                }
                break;
            case -49345041:
                if (libraryName.equals("turbomodulejsijni")) {
                    libturbomodulejsijni_so();
                    break;
                }
                break;
            case 3714672:
                if (libraryName.equals("yoga")) {
                    libyoga_so();
                    break;
                }
                break;
            case 65536138:
                if (libraryName.equals("hermesinstancejni")) {
                    libhermesinstancejni_so();
                    break;
                }
                break;
            case 86183502:
                if (libraryName.equals("jsijniprofiler")) {
                    libjsijniprofiler_so();
                    break;
                }
                break;
            case 352552524:
                if (libraryName.equals("hermes_executor")) {
                    libhermes_executor_so();
                    break;
                }
                break;
            case 614482404:
                if (libraryName.equals("hermestooling")) {
                    libhermestooling_so();
                    break;
                }
                break;
            case 688235659:
                if (libraryName.equals("react_devsupportjni")) {
                    libreact_devsupportjni_so();
                    break;
                }
                break;
            case 716617324:
                if (libraryName.equals("uimanagerjni")) {
                    libuimanagerjni_so();
                    break;
                }
                break;
            case 1590431694:
                if (libraryName.equals("jsinspector")) {
                    libjsinspector_so();
                    break;
                }
                break;
            case 2016911584:
                if (libraryName.equals("fabricjni")) {
                    libfabricjni_so();
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00a5 A[ORIG_RETURN, RETURN] */
    @Override // com.facebook.soloader.l
    public String b(String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        switch (input.hashCode()) {
            case -1793638007:
                if (input.equals("mapbufferjni")) {
                    return "reactnative";
                }
                return input;
            case -1624070447:
                if (input.equals("rninstance")) {
                    return "reactnative";
                }
                return input;
            case -1570429553:
                if (input.equals("reactnativejni")) {
                    return "reactnative";
                }
                return input;
            case -1438915853:
                if (input.equals("reactnativeblob")) {
                    return "reactnative";
                }
                return input;
            case -1382694412:
                if (input.equals("react_featureflagsjni")) {
                    return "reactnative";
                }
                return input;
            case -1259441509:
                if (input.equals("reactnativejni_common")) {
                    return "reactnative";
                }
                return input;
            case -579037304:
                if (input.equals("react_newarchdefaults")) {
                    return "reactnative";
                }
                return input;
            case -49345041:
                if (input.equals("turbomodulejsijni")) {
                    return "reactnative";
                }
                return input;
            case 3714672:
                if (input.equals("yoga")) {
                    return "reactnative";
                }
                return input;
            case 65536138:
                return !input.equals("hermesinstancejni") ? input : "hermestooling";
            case 86183502:
                return !input.equals("jsijniprofiler") ? input : "hermestooling";
            case 352552524:
                return !input.equals("hermes_executor") ? input : "hermestooling";
            case 688235659:
                if (input.equals("react_devsupportjni")) {
                    return "reactnative";
                }
                return input;
            case 716617324:
                if (input.equals("uimanagerjni")) {
                    return "reactnative";
                }
                return input;
            case 1590431694:
                if (input.equals("jsinspector")) {
                    return "reactnative";
                }
                return input;
            case 2016911584:
                if (input.equals("fabricjni")) {
                    return "reactnative";
                }
                return input;
            default:
                return input;
        }
    }

    public final native int libfabricjni_so();

    public final native int libhermes_executor_so();

    public final native int libhermesinstancejni_so();

    public final native int libhermestooling_so();

    public final native int libjsijniprofiler_so();

    public final native int libjsinspector_so();

    public final native int libmapbufferjni_so();

    public final native int libreact_devsupportjni_so();

    public final native int libreact_featureflagsjni_so();

    public final native int libreact_newarchdefaults_so();

    public final native int libreactnative_so();

    public final native int libreactnativeblob_so();

    public final native int libreactnativejni_common_so();

    public final native int libreactnativejni_so();

    public final native int librninstance_so();

    public final native int libturbomodulejsijni_so();

    public final native int libuimanagerjni_so();

    public final native int libyoga_so();
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.resources;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.resources.DeploymentScriptArgs;
import com.pulumi.azurenative.resources.outputs.ManagedServiceIdentityResponse;
import com.pulumi.azurenative.resources.outputs.SystemDataResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Deployment script object.
 * API Version: 2020-10-01.
 * 
 * ## Example Usage
 * ### DeploymentScriptsCreate
 * 
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.azurenative.resources.DeploymentScript;
 * import com.pulumi.azurenative.resources.DeploymentScriptArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var deploymentScript = new DeploymentScript(&#34;deploymentScript&#34;, DeploymentScriptArgs.builder()        
 *             .identity(Map.ofEntries(
 *                 Map.entry(&#34;type&#34;, &#34;UserAssigned&#34;),
 *                 Map.entry(&#34;userAssignedIdentities&#34;, Map.of(&#34;/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/scriptRG/providers/Microsoft.ManagedIdentity/userAssignedIdentities/uai&#34;, ))
 *             ))
 *             .kind(&#34;AzurePowerShell&#34;)
 *             .location(&#34;westus&#34;)
 *             .resourceGroupName(&#34;script-rg&#34;)
 *             .scriptName(&#34;MyDeploymentScript&#34;)
 *             .build());
 * 
 *     }
 * }
 * 
 * ```
 * ### DeploymentScriptsCreateNoUserManagedIdentity
 * 
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.azurenative.resources.DeploymentScript;
 * import com.pulumi.azurenative.resources.DeploymentScriptArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var deploymentScript = new DeploymentScript(&#34;deploymentScript&#34;, DeploymentScriptArgs.builder()        
 *             .kind(&#34;AzurePowerShell&#34;)
 *             .location(&#34;westus&#34;)
 *             .resourceGroupName(&#34;script-rg&#34;)
 *             .scriptName(&#34;MyDeploymentScript&#34;)
 *             .build());
 * 
 *     }
 * }
 * 
 * ```
 * ### DeploymentScriptsCreate_MinCreate
 * 
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.azurenative.resources.DeploymentScript;
 * import com.pulumi.azurenative.resources.DeploymentScriptArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var deploymentScript = new DeploymentScript(&#34;deploymentScript&#34;, DeploymentScriptArgs.builder()        
 *             .identity(Map.ofEntries(
 *                 Map.entry(&#34;type&#34;, &#34;UserAssigned&#34;),
 *                 Map.entry(&#34;userAssignedIdentities&#34;, Map.of(&#34;/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/scriptRG/providers/Microsoft.ManagedIdentity/userAssignedIdentities/uai&#34;, ))
 *             ))
 *             .kind(&#34;AzurePowerShell&#34;)
 *             .location(&#34;westus&#34;)
 *             .resourceGroupName(&#34;script-rg&#34;)
 *             .scriptName(&#34;MyDeploymentScript&#34;)
 *             .build());
 * 
 *     }
 * }
 * 
 * ```
 * ### DeploymentScriptsCreate_UsingCustomACIName
 * 
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.azurenative.resources.DeploymentScript;
 * import com.pulumi.azurenative.resources.DeploymentScriptArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var deploymentScript = new DeploymentScript(&#34;deploymentScript&#34;, DeploymentScriptArgs.builder()        
 *             .identity(Map.ofEntries(
 *                 Map.entry(&#34;type&#34;, &#34;UserAssigned&#34;),
 *                 Map.entry(&#34;userAssignedIdentities&#34;, Map.of(&#34;/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/scriptRG/providers/Microsoft.ManagedIdentity/userAssignedIdentities/uai&#34;, ))
 *             ))
 *             .kind(&#34;AzurePowerShell&#34;)
 *             .location(&#34;westus&#34;)
 *             .resourceGroupName(&#34;script-rg&#34;)
 *             .scriptName(&#34;MyDeploymentScript&#34;)
 *             .build());
 * 
 *     }
 * }
 * 
 * ```
 * ### DeploymentScriptsCreate_UsingExistingStorageAccount
 * 
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.azurenative.resources.DeploymentScript;
 * import com.pulumi.azurenative.resources.DeploymentScriptArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var deploymentScript = new DeploymentScript(&#34;deploymentScript&#34;, DeploymentScriptArgs.builder()        
 *             .identity(Map.ofEntries(
 *                 Map.entry(&#34;type&#34;, &#34;UserAssigned&#34;),
 *                 Map.entry(&#34;userAssignedIdentities&#34;, Map.of(&#34;/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/scriptRG/providers/Microsoft.ManagedIdentity/userAssignedIdentities/uai&#34;, ))
 *             ))
 *             .kind(&#34;AzurePowerShell&#34;)
 *             .location(&#34;westus&#34;)
 *             .resourceGroupName(&#34;script-rg&#34;)
 *             .scriptName(&#34;MyDeploymentScript&#34;)
 *             .build());
 * 
 *     }
 * }
 * 
 * ```
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:resources:DeploymentScript myresource1 /subscriptions/{subscriptionId}/resourcegroups/{resourceGroupName}/providers/Microsoft.Resources/deploymentScripts/{scriptName} 
 * ```
 * 
 * @deprecated
 * Please use one of the variants: AzureCliScript, AzurePowerShellScript.
 * 
 */
@Deprecated /* Please use one of the variants: AzureCliScript, AzurePowerShellScript. */
@ResourceType(type="azure-native:resources:DeploymentScript")
public class DeploymentScript extends com.pulumi.resources.CustomResource {
    /**
     * Optional property. Managed identity to be used for this deployment script. Currently, only user-assigned MSI is supported.
     * 
     */
    @Export(name="identity", type=ManagedServiceIdentityResponse.class, parameters={})
    private Output</* @Nullable */ ManagedServiceIdentityResponse> identity;

    /**
     * @return Optional property. Managed identity to be used for this deployment script. Currently, only user-assigned MSI is supported.
     * 
     */
    public Output<Optional<ManagedServiceIdentityResponse>> identity() {
        return Codegen.optional(this.identity);
    }
    /**
     * Type of the script.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return Type of the script.
     * 
     */
    public Output<String> kind() {
        return this.kind;
    }
    /**
     * The location of the ACI and the storage account for the deployment script.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The location of the ACI and the storage account for the deployment script.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * Name of this resource.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of this resource.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The system metadata related to this resource.
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return The system metadata related to this resource.
     * 
     */
    public Output<SystemDataResponse> systemData() {
        return this.systemData;
    }
    /**
     * Resource tags.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Type of this resource.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Type of this resource.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DeploymentScript(String name) {
        this(name, DeploymentScriptArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DeploymentScript(String name, DeploymentScriptArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DeploymentScript(String name, DeploymentScriptArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:resources:DeploymentScript", name, args == null ? DeploymentScriptArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DeploymentScript(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:resources:DeploymentScript", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:resources/v20191001preview:DeploymentScript").build()),
                Output.of(Alias.builder().type("azure-native:resources/v20201001:DeploymentScript").build())
            ))
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static DeploymentScript get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DeploymentScript(name, id, options);
    }
}
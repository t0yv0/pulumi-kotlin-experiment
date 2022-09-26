// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.insights.ManagementGroupDiagnosticSettingArgs;
import com.pulumi.azurenative.insights.outputs.ManagementGroupLogSettingsResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * The management group diagnostic setting resource.
 * API Version: 2020-01-01-preview.
 * 
 * ## Example Usage
 * ### Creates or Updates the management group diagnostic setting
 * 
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.azurenative.insights.ManagementGroupDiagnosticSetting;
 * import com.pulumi.azurenative.insights.ManagementGroupDiagnosticSettingArgs;
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
 *         var managementGroupDiagnosticSetting = new ManagementGroupDiagnosticSetting(&#34;managementGroupDiagnosticSetting&#34;, ManagementGroupDiagnosticSettingArgs.builder()        
 *             .eventHubAuthorizationRuleId(&#34;/subscriptions/fb9f25f9-5785-4510-a38f-a62f188eb9f8/resourceGroups/montest/providers/microsoft.eventhub/namespaces/mynamespace/eventhubs/myeventhub/authorizationrules/myrule&#34;)
 *             .eventHubName(&#34;myeventhub&#34;)
 *             .logs(            
 *                 Map.ofEntries(
 *                     Map.entry(&#34;category&#34;, &#34;Administrative&#34;),
 *                     Map.entry(&#34;enabled&#34;, true)
 *                 ),
 *                 Map.ofEntries(
 *                     Map.entry(&#34;category&#34;, &#34;Policy&#34;),
 *                     Map.entry(&#34;enabled&#34;, true)
 *                 ))
 *             .managementGroupId(&#34;testChildMG7&#34;)
 *             .name(&#34;setting1&#34;)
 *             .storageAccountId(&#34;/subscriptions/bfaef57f-297e-4210-bfe5-27c18cc671f7/resourceGroups/FuncAppRunners/providers/Microsoft.Storage/storageAccounts/testpersonalb6a5&#34;)
 *             .workspaceId(&#34;/subscriptions/9cf7cc0a-0ba1-4624-bc82-97e1ee25dc45/resourceGroups/mgTest/providers/Microsoft.OperationalInsights/workspaces/mgTestWorkspace&#34;)
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
 * $ pulumi import azure-native:insights:ManagementGroupDiagnosticSetting setting1 providers/Microsoft.Management/managementGroups/testChildMG7/providers/microsoft.insights/diagnosticSettings/setting1 
 * ```
 * 
 */
@ResourceType(type="azure-native:insights:ManagementGroupDiagnosticSetting")
public class ManagementGroupDiagnosticSetting extends com.pulumi.resources.CustomResource {
    /**
     * The resource Id for the event hub authorization rule.
     * 
     */
    @Export(name="eventHubAuthorizationRuleId", type=String.class, parameters={})
    private Output</* @Nullable */ String> eventHubAuthorizationRuleId;

    /**
     * @return The resource Id for the event hub authorization rule.
     * 
     */
    public Output<Optional<String>> eventHubAuthorizationRuleId() {
        return Codegen.optional(this.eventHubAuthorizationRuleId);
    }
    /**
     * The name of the event hub. If none is specified, the default event hub will be selected.
     * 
     */
    @Export(name="eventHubName", type=String.class, parameters={})
    private Output</* @Nullable */ String> eventHubName;

    /**
     * @return The name of the event hub. If none is specified, the default event hub will be selected.
     * 
     */
    public Output<Optional<String>> eventHubName() {
        return Codegen.optional(this.eventHubName);
    }
    /**
     * Location of the resource
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return Location of the resource
     * 
     */
    public Output<Optional<String>> location() {
        return Codegen.optional(this.location);
    }
    /**
     * The list of logs settings.
     * 
     */
    @Export(name="logs", type=List.class, parameters={ManagementGroupLogSettingsResponse.class})
    private Output</* @Nullable */ List<ManagementGroupLogSettingsResponse>> logs;

    /**
     * @return The list of logs settings.
     * 
     */
    public Output<Optional<List<ManagementGroupLogSettingsResponse>>> logs() {
        return Codegen.optional(this.logs);
    }
    /**
     * Azure resource name
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Azure resource name
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The service bus rule Id of the diagnostic setting. This is here to maintain backwards compatibility.
     * 
     */
    @Export(name="serviceBusRuleId", type=String.class, parameters={})
    private Output</* @Nullable */ String> serviceBusRuleId;

    /**
     * @return The service bus rule Id of the diagnostic setting. This is here to maintain backwards compatibility.
     * 
     */
    public Output<Optional<String>> serviceBusRuleId() {
        return Codegen.optional(this.serviceBusRuleId);
    }
    /**
     * The resource ID of the storage account to which you would like to send Diagnostic Logs.
     * 
     */
    @Export(name="storageAccountId", type=String.class, parameters={})
    private Output</* @Nullable */ String> storageAccountId;

    /**
     * @return The resource ID of the storage account to which you would like to send Diagnostic Logs.
     * 
     */
    public Output<Optional<String>> storageAccountId() {
        return Codegen.optional(this.storageAccountId);
    }
    /**
     * Azure resource type
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Azure resource type
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * The full ARM resource ID of the Log Analytics workspace to which you would like to send Diagnostic Logs. Example: /subscriptions/4b9e8510-67ab-4e9a-95a9-e2f1e570ea9c/resourceGroups/insights-integration/providers/Microsoft.OperationalInsights/workspaces/viruela2
     * 
     */
    @Export(name="workspaceId", type=String.class, parameters={})
    private Output</* @Nullable */ String> workspaceId;

    /**
     * @return The full ARM resource ID of the Log Analytics workspace to which you would like to send Diagnostic Logs. Example: /subscriptions/4b9e8510-67ab-4e9a-95a9-e2f1e570ea9c/resourceGroups/insights-integration/providers/Microsoft.OperationalInsights/workspaces/viruela2
     * 
     */
    public Output<Optional<String>> workspaceId() {
        return Codegen.optional(this.workspaceId);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ManagementGroupDiagnosticSetting(String name) {
        this(name, ManagementGroupDiagnosticSettingArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ManagementGroupDiagnosticSetting(String name, ManagementGroupDiagnosticSettingArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ManagementGroupDiagnosticSetting(String name, ManagementGroupDiagnosticSettingArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:insights:ManagementGroupDiagnosticSetting", name, args == null ? ManagementGroupDiagnosticSettingArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ManagementGroupDiagnosticSetting(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:insights:ManagementGroupDiagnosticSetting", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:insights/v20200101preview:ManagementGroupDiagnosticSetting").build()),
                Output.of(Alias.builder().type("azure-native:insights/v20210501preview:ManagementGroupDiagnosticSetting").build())
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
    public static ManagementGroupDiagnosticSetting get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ManagementGroupDiagnosticSetting(name, id, options);
    }
}
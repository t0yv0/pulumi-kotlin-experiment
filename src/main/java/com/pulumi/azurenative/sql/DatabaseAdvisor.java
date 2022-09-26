// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sql;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.sql.DatabaseAdvisorArgs;
import com.pulumi.azurenative.sql.outputs.RecommendedActionResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Database, Server or Elastic Pool Advisor.
 * API Version: 2020-11-01-preview.
 * 
 * ## Example Usage
 * ### Update database advisor
 * 
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.azurenative.sql.DatabaseAdvisor;
 * import com.pulumi.azurenative.sql.DatabaseAdvisorArgs;
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
 *         var databaseAdvisor = new DatabaseAdvisor(&#34;databaseAdvisor&#34;, DatabaseAdvisorArgs.builder()        
 *             .advisorName(&#34;CreateIndex&#34;)
 *             .autoExecuteStatus(&#34;Disabled&#34;)
 *             .databaseName(&#34;IndexAdvisor_test_3&#34;)
 *             .resourceGroupName(&#34;workloadinsight-demos&#34;)
 *             .serverName(&#34;misosisvr&#34;)
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
 * $ pulumi import azure-native:sql:DatabaseAdvisor CreateIndex /subscriptions/00000000-1111-2222-3333-444444444444/resourceGroups/workloadinsight-demos/providers/Microsoft.Sql/servers/misosisvr/databases/IndexAdvisor_test_3/advisors/CreateIndex 
 * ```
 * 
 */
@ResourceType(type="azure-native:sql:DatabaseAdvisor")
public class DatabaseAdvisor extends com.pulumi.resources.CustomResource {
    /**
     * Gets the status of availability of this advisor to customers. Possible values are &#39;GA&#39;, &#39;PublicPreview&#39;, &#39;LimitedPublicPreview&#39; and &#39;PrivatePreview&#39;.
     * 
     */
    @Export(name="advisorStatus", type=String.class, parameters={})
    private Output<String> advisorStatus;

    /**
     * @return Gets the status of availability of this advisor to customers. Possible values are &#39;GA&#39;, &#39;PublicPreview&#39;, &#39;LimitedPublicPreview&#39; and &#39;PrivatePreview&#39;.
     * 
     */
    public Output<String> advisorStatus() {
        return this.advisorStatus;
    }
    /**
     * Gets the auto-execute status (whether to let the system execute the recommendations) of this advisor. Possible values are &#39;Enabled&#39; and &#39;Disabled&#39;
     * 
     */
    @Export(name="autoExecuteStatus", type=String.class, parameters={})
    private Output<String> autoExecuteStatus;

    /**
     * @return Gets the auto-execute status (whether to let the system execute the recommendations) of this advisor. Possible values are &#39;Enabled&#39; and &#39;Disabled&#39;
     * 
     */
    public Output<String> autoExecuteStatus() {
        return this.autoExecuteStatus;
    }
    /**
     * Gets the resource from which current value of auto-execute status is inherited. Auto-execute status can be set on (and inherited from) different levels in the resource hierarchy. Possible values are &#39;Subscription&#39;, &#39;Server&#39;, &#39;ElasticPool&#39;, &#39;Database&#39; and &#39;Default&#39; (when status is not explicitly set on any level).
     * 
     */
    @Export(name="autoExecuteStatusInheritedFrom", type=String.class, parameters={})
    private Output<String> autoExecuteStatusInheritedFrom;

    /**
     * @return Gets the resource from which current value of auto-execute status is inherited. Auto-execute status can be set on (and inherited from) different levels in the resource hierarchy. Possible values are &#39;Subscription&#39;, &#39;Server&#39;, &#39;ElasticPool&#39;, &#39;Database&#39; and &#39;Default&#39; (when status is not explicitly set on any level).
     * 
     */
    public Output<String> autoExecuteStatusInheritedFrom() {
        return this.autoExecuteStatusInheritedFrom;
    }
    /**
     * Resource kind.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return Resource kind.
     * 
     */
    public Output<String> kind() {
        return this.kind;
    }
    /**
     * Gets the time when the current resource was analyzed for recommendations by this advisor.
     * 
     */
    @Export(name="lastChecked", type=String.class, parameters={})
    private Output<String> lastChecked;

    /**
     * @return Gets the time when the current resource was analyzed for recommendations by this advisor.
     * 
     */
    public Output<String> lastChecked() {
        return this.lastChecked;
    }
    /**
     * Resource location.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Resource location.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * Resource name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Gets that status of recommendations for this advisor and reason for not having any recommendations. Possible values include, but are not limited to, &#39;Ok&#39; (Recommendations available),LowActivity (not enough workload to analyze), &#39;DbSeemsTuned&#39; (Database is doing well), etc.
     * 
     */
    @Export(name="recommendationsStatus", type=String.class, parameters={})
    private Output<String> recommendationsStatus;

    /**
     * @return Gets that status of recommendations for this advisor and reason for not having any recommendations. Possible values include, but are not limited to, &#39;Ok&#39; (Recommendations available),LowActivity (not enough workload to analyze), &#39;DbSeemsTuned&#39; (Database is doing well), etc.
     * 
     */
    public Output<String> recommendationsStatus() {
        return this.recommendationsStatus;
    }
    /**
     * Gets the recommended actions for this advisor.
     * 
     */
    @Export(name="recommendedActions", type=List.class, parameters={RecommendedActionResponse.class})
    private Output<List<RecommendedActionResponse>> recommendedActions;

    /**
     * @return Gets the recommended actions for this advisor.
     * 
     */
    public Output<List<RecommendedActionResponse>> recommendedActions() {
        return this.recommendedActions;
    }
    /**
     * Resource type.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DatabaseAdvisor(String name) {
        this(name, DatabaseAdvisorArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DatabaseAdvisor(String name, DatabaseAdvisorArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DatabaseAdvisor(String name, DatabaseAdvisorArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:sql:DatabaseAdvisor", name, args == null ? DatabaseAdvisorArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DatabaseAdvisor(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:sql:DatabaseAdvisor", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:sql/v20140401:DatabaseAdvisor").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20150501preview:DatabaseAdvisor").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20200202preview:DatabaseAdvisor").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20200801preview:DatabaseAdvisor").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20201101preview:DatabaseAdvisor").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20210201preview:DatabaseAdvisor").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20210501preview:DatabaseAdvisor").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20210801preview:DatabaseAdvisor").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20211101:DatabaseAdvisor").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20211101preview:DatabaseAdvisor").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20220201preview:DatabaseAdvisor").build()),
                Output.of(Alias.builder().type("azure-native:sql/v20220501preview:DatabaseAdvisor").build())
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
    public static DatabaseAdvisor get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DatabaseAdvisor(name, id, options);
    }
}